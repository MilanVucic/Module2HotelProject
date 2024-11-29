package lesson_15;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lesson_15.reddit.RedditPostWrapper;
import lesson_15.reddit.RedditResponse;

import java.io.*;
import java.net.URL;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            RedditResponse redditResponse = objectMapper.readValue(new URL("https://www.reddit.com/.json"), RedditResponse.class);
            List<RedditPostWrapper> redditPostWrapperList = redditResponse.getData().getChildren();
            for (RedditPostWrapper postWrapper : redditPostWrapperList) {
                System.out.println(postWrapper.getRedditPost().toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void jacksonExample() {
        Person p = new Person(20, "Milan", 199.4);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        try {
            Person another = objectMapper.readValue(new File("example.json"), Person.class);
            System.out.println(another);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readPersonFromFile() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("example.ser"));
            Person p = (Person) ois.readObject();
            System.out.println(p);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void saveSerializedToFile() {
        Person p = new Person(20, "Milan", 199.4);

        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("example.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(p);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
