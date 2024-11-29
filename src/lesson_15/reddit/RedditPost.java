package lesson_15.reddit;

public class RedditPost {
    private String subreddit;
    private String title;

    @Override
    public String toString() {
        return "RedditPost{" +
                "subreddit='" + subreddit + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
