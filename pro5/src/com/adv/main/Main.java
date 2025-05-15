package com.adv.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.adv.config.ConfigFile;
import com.adv.pojo.Student;
import com.adv.pojo1.Customer;

public class Main {
	public static void main(String[] args) {
		
	   AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext(ConfigFile.class);
	   Student s  =  a.getBean(Student.class);
	   Customer c = a.getBean(Customer.class);
	   System.out.println(s);
	   System.out.println(c);
	}

}
