package vitam;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;


public class FileRepositoryTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void should_add_a_line() throws Exception {
        // Given
        Path path = temporaryFolder.newFile().toPath();
        FileRepository fileRepository = new FileRepository(path);

        // When
        fileRepository.addEntry("un exemple de message");

        // Then
        assertThat(path).hasContent("un exemple de message");
    }


}
