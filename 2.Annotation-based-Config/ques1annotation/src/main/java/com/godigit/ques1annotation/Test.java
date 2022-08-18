package com.godigit.ques1annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
       ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
       Employee e1=(Employee)context.getBean("employee");
       System.out.println(e1);
	}

}
