package main2;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MyRepository {

    private String name;

    @Inject
    public MyRepository(String name) {
        this.name = name;
        System.out.println("instanciation");
    }

    public String tst() {
        return String.format("%s: azeza", name);
    }

}
