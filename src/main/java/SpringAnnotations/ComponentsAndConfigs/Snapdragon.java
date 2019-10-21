package SpringAnnotations.ComponentsAndConfigs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author F0urth
 */
public class Snapdragon implements MobileProcessor {

    private static final Logger logger = LoggerFactory.getLogger(Snapdragon.class);

    @Override
    public void process() {
        logger.info("Word best CPU");
    }
}
