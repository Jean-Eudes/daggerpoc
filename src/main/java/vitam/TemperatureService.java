package vitam;

import javax.inject.Inject;
import java.io.IOException;

public class TemperatureService {

    private FileRepository fileRepository;

    @Inject
    public TemperatureService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public void computeTemperature() throws IOException {
        double t = 50;
        fileRepository.store("temperature: " + t);
    }

}
