package Components;

import org.springframework.stereotype.Component;

/**
 * @author F0urth
 */
@Component
public class Bike
    implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Drin drin");
    }
}
