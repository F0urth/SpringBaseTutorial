import Components.Car;
import Components.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author F0urth => tutorial https://www.youtube.com/watch?v=If1Lw4pLLEo
 */
public final class Application {

    public static void main(String[] args) {

        //-------------------------------------------------------------------------------------------------

        Vehicle obj = new Car();
        obj.drive();

        //-------------------------------------------------------------------------------------------------

        ApplicationContext context = new ClassPathXmlApplicationContext();

        Vehicle veh = (Vehicle) context.getBean("vehicle");

        //-------------------------------------------------------------------------------------------------

    }
}
