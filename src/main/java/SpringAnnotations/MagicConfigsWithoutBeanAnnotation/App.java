package SpringAnnotations.MagicConfigsWithoutBeanAnnotation;

import SpringAnnotations.MagicConfigsWithoutBeanAnnotation.ComponentsAndConfigs.ApplicationConfiguration;
import SpringAnnotations.MagicConfigsWithoutBeanAnnotation.ComponentsAndConfigs.Phone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author F0urth
 */
public final class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        Phone phone = context.getBean(Phone.class);
        phone.config();
    }
}
