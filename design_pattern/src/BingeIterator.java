import java.util.Iterator;
import java.util.List;

public class BingeIterator implements EpisodeIterator {
    private final Iterator<Season> seasonIterator;
    private EpisodeIterator currentEpisodeIterator;

    public BingeIterator(List<Season> seasons) {
        this.seasonIterator = seasons.iterator();
        if (seasonIterator.hasNext()) {
            currentEpisodeIterator = seasonIterator.next().getNormalIterator();
        }
    }

    @Override
    public boolean hasNext() {
        while (currentEpisodeIterator != null && !currentEpisodeIterator.hasNext()) {
            if (seasonIterator.hasNext()) {
                currentEpisodeIterator = seasonIterator.next().getNormalIterator();
            } else {
                return false;
            }
        }
        return currentEpisodeIterator != null && currentEpisodeIterator.hasNext();
    }

    @Override
    public Episode next() {
        return currentEpisodeIterator.next();
    }
}
