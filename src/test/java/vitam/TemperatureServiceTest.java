package vitam;

import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TemperatureServiceTest {

    @Test
    public void test_temperature() throws IOException {
        // Given
        FileRepository fileRepository = mock(FileRepository.class);
        TemperatureService temperatureService = new TemperatureService(fileRepository);

        // When
        temperatureService.putTemperature();

        // Then
        verify(fileRepository).addEntry("temperature: 24.0\n");
    }

}
