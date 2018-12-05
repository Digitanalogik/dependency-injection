package guru.springframework;

import guru.springframework.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemo2Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemo2Application.class, args);

        MyController controller = (MyController) ctx.getBean( "myController" );

        controller.hello();
    }
}
