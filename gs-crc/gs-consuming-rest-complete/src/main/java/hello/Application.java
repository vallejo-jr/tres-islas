package hello;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.web.client.RestTemplate;

public class Application {

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Greeting greeting = restTemplate.getForObject("http://localhost:8080/greeting", Greeting.class);
        System.out.println("Name:    " + greeting.getId ());
        System.out.println("About:   " + greeting.getContent ());
        Collection<Greeting> greetings = restTemplate.getForObject("http://localhost:8080/greetingList?num=10", ArrayList.class);
        for(Greeting g: greetings) {
          System.out.println("Name:    " + g.getId ());
          System.out.println("About:   " + g.getContent ());
        }
    }

}