import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Season implements Iterable<Episode> {
    private final List<Episode> episodes = new ArrayList<>();

    public void addEpisode(Episode e) {
        episodes.add(e);
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public EpisodeIterator getNormalIterator() {
        return new SeasonIterator(episodes);
    }

    public EpisodeIterator getReverseIterator() {
        return new ReverseSeasonIterator(episodes);
    }

    public EpisodeIterator getShuffleIterator() {
        return new ShuffleSeasonIterator(episodes);
    }

    @Override
    public Iterator<Episode> iterator() {
        return episodes.iterator(); // So for-each works
    }
}
