package vitam;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

public class FileRepositoryTest {

    private FileRepository fileRepository;

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void should_store_data_on_file() throws Exception {
        // Given
        String data = "12345678";
        Path path = temporaryFolder.newFile().toPath();
        fileRepository = new FileRepository(path);

        // When
        fileRepository.store(data);

        // Then
        assertThat(path).hasContent(data);
    }

}
