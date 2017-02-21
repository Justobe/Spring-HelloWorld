package main;

/**
 * Created by YanMing on 2017/2/19.
 */
public class GreetingServiceImpl implements GreetingService{
    private String greeting;
    public GreetingServiceImpl() {

    }
    public GreetingServiceImpl(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public void sayGreeting() {
        System.out.println(greeting);
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
