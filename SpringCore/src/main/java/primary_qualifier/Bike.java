package primary_qualifier;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
    @Override
    public void run() {
        System.out.println("bike is ruuning");
    }
}
