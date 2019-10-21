package SpringAnnotations.MagicConfigsWithoutBeanAnnotation.ComponentsAndConfigs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author F0urth
 */
@Component("cpu")
@Primary
public class Snapdragon implements MobileProcessor {

    private static final Logger logger = LoggerFactory.getLogger(Snapdragon.class);

    @Override
    public void process() {
        logger.info("Word best CPU");
    }
}
