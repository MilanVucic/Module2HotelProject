package lesson_15.reddit;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RedditPostWrapper {
    private String kind;
    @JsonProperty("data")
    private RedditPost redditPost;

    public RedditPost getRedditPost() {
        return redditPost;
    }
}
