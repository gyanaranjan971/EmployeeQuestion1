package model;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Tester3 {

	public static void deleteData() {
		
		Configuration configuration=new Configuration();
		 configuration.configure("hibernate.cfg.xml");
		 System.out.println("works");
		 SessionFactory factory=configuration.buildSessionFactory();
		 Session session=factory.openSession();
		 session.getTransaction().begin();
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter employee id to delete");
		 Employee1 employee=(Employee1)session.get(Employee1.class, sc.nextLong());
		 if(employee!=null) {
			session.delete(employee);
			session.flush();
			session.getTransaction().commit();
			System.out.println("one record deleted successfully");
			
	}
		 else {
			 System.out.println("record not found enter correct id");
		 }
		 session.close();
		 
	}

}

