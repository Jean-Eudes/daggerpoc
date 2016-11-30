package vitam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileRepository {

    private final Path path;

    public FileRepository(Path path) {
        this.path = path;
    }

    public void store(String data) throws IOException {
        Files.write(path, data.getBytes(), StandardOpenOption.APPEND);
    }

}
