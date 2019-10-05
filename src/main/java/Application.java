import Components.Car;
import Components.SubComponents.Tyre;
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

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Vehicle veh = (Vehicle) context.getBean("vehicle");

        veh.drive();

        //-------------------------------------------------------------------------------------------------

        Vehicle veh2 = (Vehicle) context.getBean("car");
        veh2.drive();

        Vehicle veh3 = (Vehicle) context.getBean("bike");
        veh3.drive();

        //-------------------------------------------------------------------------------------------------

        Tyre t = (Tyre) context.getBean("tyre");
        System.out.println(t);


        Tyre t2 = (Tyre) context.getBean("tyre2");
        System.out.println(t2);

        //-------------------------------------------------------------------------------------------------

        Vehicle veh4 = (Vehicle) context.getBean("car");
        System.out.println(veh4);
    }
}
