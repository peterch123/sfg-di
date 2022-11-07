package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");

		System.out.println(i18nController.sayHello());

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
