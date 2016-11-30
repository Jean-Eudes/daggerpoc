package main2;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;

@Singleton
public class MyService {

    private Provider<MyRepository> myRepository;

    @Inject
    public MyService(Provider<MyRepository> myRepository) {
        this.myRepository = myRepository;
    }

    public String display() {
        return myRepository.get().tst();
    }

}
