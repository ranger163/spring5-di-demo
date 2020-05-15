package me.inassar.didemo;

import me.inassar.didemo.controllers.ConstructorInjectedController;
import me.inassar.didemo.controllers.MyController;
import me.inassar.didemo.controllers.PropertyInjectedController;
import me.inassar.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) context.getBean("myController");
        controller.hello();

        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(SetterInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
    }

}
