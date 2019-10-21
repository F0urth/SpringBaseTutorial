package Components;

import Components.SubComponents.Tyre;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author F0urth
 */

@Component
public class Car implements Vehicle {

    private static final Logger logger = LoggerFactory.getLogger(Car.class);

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
        logger.info("Brum brum");
    }

    @Override
    public String toString() {
        return "Car{" +
            "tyre=" + tyre +
            '}';
    }
}
