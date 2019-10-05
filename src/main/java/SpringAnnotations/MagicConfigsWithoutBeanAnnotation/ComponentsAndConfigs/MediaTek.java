package SpringAnnotations.MagicConfigsWithoutBeanAnnotation.ComponentsAndConfigs;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author F0urth
 */
@Component
public class MediaTek
    implements MobileProcessor {

    @Override
    public void process() {
        System.out.println("Sec best xD " + this.getClass());
    }
}
