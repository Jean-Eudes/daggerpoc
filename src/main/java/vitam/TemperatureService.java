package vitam;

import javax.inject.Inject;
import java.io.IOException;

import static java.lang.String.format;

public class TemperatureService {

    private FileRepository fileRepository;

    @Inject
    public TemperatureService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public boolean putTemperature() throws IOException {
        double temperature = 24;

        fileRepository.addEntry(format("temperature: %s\n", temperature));
        return true;
    }

}
