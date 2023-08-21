package com.madhu.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class LaunchAPP {

	public static void main(String[] args) {
//	Resource res	=new ClassPathResource("beans.xml");
//	BeanFactory factory =  new XmlBeanFactory(res);
//	factory.getBean("credit","CreditClass.java");
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		ProcessPayment pp = context.getBean("pp", ProcessPayment.class);
		pp.billPayment(100.89);

	}

}
