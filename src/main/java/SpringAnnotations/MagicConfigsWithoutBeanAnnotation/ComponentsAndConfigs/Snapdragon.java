package SpringAnnotations.MagicConfigsWithoutBeanAnnotation.ComponentsAndConfigs;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author F0urth
 */
@Component("cpu") @Primary
public class Snapdragon
    implements MobileProcessor {


    @Override
    public void process() {
        System.out.println("Word best CPU");
    }
}
