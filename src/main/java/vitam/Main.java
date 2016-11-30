package vitam;

import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class Main {

    public static void main(String[] args) {

        TemperatureComponent temperatureComponent = DaggerTemperatureComponent.create();
        TemperatureResource temperatureResource = temperatureComponent.loadTemperatureResource();

        URI baseUri = UriBuilder.fromUri("http://localhost/").port(9998).build();
        ResourceConfig config = new ResourceConfig();

        config.register(temperatureResource);

        Server server = JettyHttpContainerFactory.createServer(baseUri, config);
    }

}
