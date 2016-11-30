package vitam;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;

public class TemperatureServiceTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @InjectMocks
    private TemperatureService temperatureService;

    @Mock
    private FileRepository fileRepository;

    @Test
    public void should_compute_and_store_temperature() throws Exception {
        // Given / When
        temperatureService.computeTemperature();

        // Then
        verify(fileRepository).store("temperature: 50.0");
    }

}
