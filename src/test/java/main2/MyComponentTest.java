package main2;

import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.junit.Test;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class MyComponentTest {

    @Test
    public void should_do_injection() throws Exception {
        MyComponent build = DaggerMyComponent.builder().build();
        MyService myService = build.get();
        //MyService2 myService2 = build.get2();
        System.out.println(myService.display());
        //System.out.println(myService2.display());

        myService = build.get();
        System.out.println(myService.display());
    }

    @Test
    public void name() throws Exception {
        MyService myService = DaggerMyComponent.builder().build().get();
        System.out.println(myService.display());

        URI baseUri = UriBuilder.fromUri("http://localhost/").port(9998).build();
        ResourceConfig config = new ResourceConfig(MyResource.class);
        Server server = JettyHttpContainerFactory.createServer(baseUri, config);

        server.start();
        System.out.println(server.getURI());
    }

}
