package vitam;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.io.IOException;

@Path("/")
public class TemperatureResource {

    private TemperatureService temperatureService;

    @Inject
    public TemperatureResource(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @POST
    public void callTemperature() throws IOException {

        temperatureService.putTemperature();
    }

}
