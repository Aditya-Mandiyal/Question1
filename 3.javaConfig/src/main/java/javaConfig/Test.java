package javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BikeConfig.class);
		Bike bike = context.getBean(Bike.class);
		System.out.println(bike.splendor());
		System.out.println(bike.ct100());
	}

}
