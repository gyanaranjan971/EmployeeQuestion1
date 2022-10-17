package model;

import org.hibernate.cfg.Configuration;

import model.Employee1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Tester {

	public static void insertMethod()
	{
		Configuration configuration=new Configuration();
		 configuration.configure("hibernate.cfg.xml");
		 System.out.println("works");
		 SessionFactory factory=configuration.buildSessionFactory();
		 Session session=factory.openSession();
		 session.getTransaction().begin();
		 Employee1 employee=new Employee1();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter employee id");
		 employee.setId(sc.nextLong());
		 System.out.println("enter first name");
		 employee.setFirstName(sc.next());
		 System.out.println("enter last name");
		 employee.setLastName(sc.next());
		 System.out.println("enter email");
		 employee.setEmail(sc.next());
		 session.save(employee);
		session.getTransaction().commit();
		 
	}

}
