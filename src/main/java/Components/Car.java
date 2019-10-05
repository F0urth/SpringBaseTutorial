package Components;

import Components.SubComponents.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author F0urth
 */

@Component
public class Car
    implements Vehicle {

    @Autowired
    private Tyre tyre;


    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    @Override
    public void drive() {
        System.out.println("Brum brum");
    }

    @Override
    public String toString() {
        return "Car{" +
            "tyre=" + tyre +
            '}';
    }
}
