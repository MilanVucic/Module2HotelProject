package lesson_4;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSaver implements Callback<Integer>, Closeable {
    @Override
    public void onSuccess(Integer result) {
        try {
            Files.writeString(Path.of("example.txt"), "Result" + result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onError(String message) {

    }

    public void saveFilesAndStuff() {

    }

    @Override
    public void close() throws IOException {

    }

}
