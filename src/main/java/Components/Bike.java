package Components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author F0urth
 */
@Component
public class Bike implements Vehicle {

    private static final Logger logger = LoggerFactory.getLogger(Bike.class);

    @Override
    public void drive() {
        logger.info("Drin drin");
    }
}
