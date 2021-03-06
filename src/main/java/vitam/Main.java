package vitam;

import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        URI baseUri = UriBuilder.fromUri("http://localhost/").port(9998).build();
        ResourceConfig config = new ResourceConfig();

        TemperatureComponent temperatureComponent = DaggerTemperatureComponent.create();

        TemperatureResource temperature = temperatureComponent.findTemperature();

        config.register(temperature);

        Server server = JettyHttpContainerFactory.createServer(baseUri, config);
    }

}
