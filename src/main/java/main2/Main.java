package main2;

import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class Main {

    public static void main(String[] args) {
        MyModule myModule = new MyModule("test");
        MyResource myResource = DaggerMyComponent.builder().myModule(myModule).build().get3();
        System.out.println(myResource.get());

        URI baseUri = UriBuilder.fromUri("http://localhost/").port(9998).build();
        ResourceConfig config = new ResourceConfig();

        config.register(myResource);

        Server server = JettyHttpContainerFactory.createServer(baseUri, config);
    }

}
