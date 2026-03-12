package annotation_configuration.pre_and_post_using_annotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {
   public Vehicle(){
       System.out.println("constructor");
   }

   @PostConstruct
    public void moving(){
        System.out.println("vehicle is moving");
    }

    @PreDestroy
    public void accident(){
        System.out.println("Thank god, no one left");
    }
}
