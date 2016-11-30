package main2;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class MyModule {

    private String name;

    public MyModule(String name) {
        this.name = name;
    }

    @Provides
    @Singleton
    public MyRepository initService() {
        return new MyRepository(name);
    }

}
