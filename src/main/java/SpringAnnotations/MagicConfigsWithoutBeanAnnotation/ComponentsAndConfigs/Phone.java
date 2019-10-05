package SpringAnnotations.MagicConfigsWithoutBeanAnnotation.ComponentsAndConfigs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author F0urth
 */

@Component
public class Phone {

    @Autowired @Qualifier("mediaTek")
    MobileProcessor mobileProcessor;

    public MobileProcessor getMobileProcessor() {
        return mobileProcessor;
    }

    public void setMobileProcessor(MobileProcessor mobileProcessor) {
        this.mobileProcessor = mobileProcessor;
    }

    public void config() {
        System.out.println("No po prostu telefon");
        mobileProcessor.process();
    }

    @Override
    public String toString() {
        return "Phone{" +
            "mobileProcessor=" + mobileProcessor +
            '}';
    }
}