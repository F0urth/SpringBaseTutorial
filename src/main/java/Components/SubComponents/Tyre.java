package Components.SubComponents;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author F0urth
 */
public class Tyre {

    private static final Logger logger;

    static {
        logger = LoggerFactory.getLogger(Tyre.class);
    }

    private String brand;

    public Tyre() {
    }

    public Tyre(String brand) {
        logger.info("Inject thought constructor");
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        logger.info("Inject thought setter");
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tyre{" +
            "brand='" + brand + '\'' +
            '}';
    }
}
