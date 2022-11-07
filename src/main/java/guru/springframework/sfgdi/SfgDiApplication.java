package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructedInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("Primary Bean test");
		System.out.println(myController.sayHello());

		System.out.println("propertyInjectedController test");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println("propertyInjectedController " + propertyInjectedController.getGreeting());

		System.out.println("setterInjectedController test");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println("setterInjectedController " + setterInjectedController.getGreeting());

		System.out.println("constructedInjectedController test");
		ConstructedInjectedController constructedInjectedController = (ConstructedInjectedController) ctx.getBean("constructedInjectedController");
		System.out.println("constructedInjectedController " + constructedInjectedController.getGreeting());

	}

}
