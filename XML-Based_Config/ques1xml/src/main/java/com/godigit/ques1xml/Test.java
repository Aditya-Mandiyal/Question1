package com.godigit.ques1xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
       // this is a IOC container for create object
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        Wash wash1=(Wash)context.getBean("washing");
        wash1.washing();
	}

}
