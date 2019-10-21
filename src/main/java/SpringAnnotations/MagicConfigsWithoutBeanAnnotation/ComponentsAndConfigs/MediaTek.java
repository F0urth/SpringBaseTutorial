package SpringAnnotations.MagicConfigsWithoutBeanAnnotation.ComponentsAndConfigs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author F0urth
 */
@Component
public class MediaTek implements MobileProcessor {

    private static final Logger logger = LoggerFactory.getLogger(MediaTek.class);

    @Override
    public void process() {
        logger.info("Sec best xD " + this.getClass());
    }
}
