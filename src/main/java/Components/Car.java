package Components;

import org.springframework.stereotype.Component;

/**
 * @author F0urth
 */

@Component
public class Car
    implements Vehicle {


    @Override
    public void drive() {
        System.out.println("Brum brum");
    }
}
