public class Main {
    public static void main(String[] args) {
        Series series = new Series();

        Season season1 = new Season();
        season1.addEpisode(new Episode("S1E1:The Beginning", 1800));
        season1.addEpisode(new Episode("S1E2:The Middle", 1900));
        season1.addEpisode(new Episode("S1E3:The End", 2000));
        series.addSeason(season1);

        Season season2 = new Season();
        season2.addEpisode(new Episode("S2E1:Return", 1800));
        season2.addEpisode(new Episode("S2E2:Twist", 1700));
        series.addSeason(season2);

        System.out.println("Normal Order (Season 1)");
        EpisodeIterator normalIt = season1.getNormalIterator();
        while (normalIt.hasNext()) {
            System.out.println(normalIt.next());
        }

        System.out.println("\nReverse Order (Season 1)");
        EpisodeIterator reverseIt = season1.getReverseIterator();
        while (reverseIt.hasNext()) {
            System.out.println(reverseIt.next());
        }

        System.out.println("\nShuffle Order (Season 1)");
        EpisodeIterator shuffleIt = season1.getShuffleIterator();
        while (shuffleIt.hasNext()) {
            System.out.println(shuffleIt.next());
        }

        System.out.println("\nBinge Mode (Whole Series)");
        EpisodeIterator bingeIt = series.getBingeIterator();
        while (bingeIt.hasNext()) {
            System.out.println(bingeIt.next());
        }
    }
}
