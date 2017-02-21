package main;

/**
 * Created by YanMing on 2017/2/19.
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloApp {
    public static void main(String[]args) throws Exception{
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "helloworld.xml");

        GreetingService greetingService = (GreetingService) context.getBean("greetingService");

        greetingService.sayGreeting();

        GreetingServiceImpl greetingService1 =
                new GreetingServiceImpl("Hello World!");
    }
}
