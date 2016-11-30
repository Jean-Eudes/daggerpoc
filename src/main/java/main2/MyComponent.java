package main2;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules ={ MyModule.class})
public interface MyComponent {


    MyService get();
    MyService2 get2();
    MyResource get3();
}
