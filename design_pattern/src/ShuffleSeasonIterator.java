import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleSeasonIterator implements EpisodeIterator {
    private final List<Episode> shuffledList;
    private int index = 0;

    public ShuffleSeasonIterator(List<Episode> episodes) {
        shuffledList = new ArrayList<>(episodes);
        Collections.shuffle(shuffledList, new Random(42)); // fixed seed
    }

    @Override
    public boolean hasNext() {
        return index < shuffledList.size();
    }

    @Override
    public Episode next() {
        return shuffledList.get(index++);
    }
}
