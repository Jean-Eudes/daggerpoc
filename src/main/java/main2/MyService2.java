package main2;

import javax.inject.Inject;

public class MyService2 {

    private MyRepository myRepository;

    @Inject
    public MyService2(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public String display() {
        return myRepository.tst();
    }

}
