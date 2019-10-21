package SpringAnnotations.ComponentsAndConfigs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author F0urth
 */
@Configuration
public class ApplicationConfiguration {


    @Bean
    public Phone getPhone() {
        return new Phone();
    }

    @Bean
    public MobileProcessor getProcessor() {
        return new Snapdragon();
    }
}
