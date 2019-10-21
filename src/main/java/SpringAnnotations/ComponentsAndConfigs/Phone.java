package SpringAnnotations.ComponentsAndConfigs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author F0urth
 */
public class Phone {

    private static final Logger logger = LoggerFactory.getLogger(Phone.class);

    @Autowired
    MobileProcessor mobileProcessor;

    public MobileProcessor getMobileProcessor() {
        return mobileProcessor;
    }

    public void setMobileProcessor(MobileProcessor mobileProcessor) {
        this.mobileProcessor = mobileProcessor;
    }

    public void config() {
        logger.info("No po prostu telefon");
        mobileProcessor.process();
    }

    @Override
    public String toString() {
        return "Phone{" +
            "mobileProcessor=" + mobileProcessor +
            '}';
    }
}
