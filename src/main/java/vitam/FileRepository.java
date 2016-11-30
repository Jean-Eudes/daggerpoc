package vitam;

import javax.inject.Inject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileRepository {

    private final Path path;

    public FileRepository(Path path) {
        this.path = path;
    }

    public void addEntry(String entry) throws IOException {
        Files.write(path, entry.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }

}
