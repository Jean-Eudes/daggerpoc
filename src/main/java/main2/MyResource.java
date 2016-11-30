package main2;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class MyResource {

    private MyService myService;

    @Inject
    public MyResource(MyService myService) {
        this.myService = myService;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return myService.display();
    }

}
