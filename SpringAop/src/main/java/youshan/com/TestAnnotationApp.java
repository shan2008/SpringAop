package youshan.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by syou on 2018/1/22.
 */
public class TestAnnotationApp {

    public static void main(String[] args) {
        ApplicationContext applicationContenxt = new ClassPathXmlApplicationContext("classpath:config/applicationContext.xml");
        TestController controller = (TestController)applicationContenxt.getBean("testController");
        controller.login();
    }
}
