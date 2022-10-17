package model;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Tester2 {

	public static void updateMethod() {
		Configuration configuration=new Configuration();
		 configuration.configure("hibernate.cfg.xml");
		 System.out.println("works");
		 SessionFactory factory=configuration.buildSessionFactory();
		 Session session=factory.openSession();
		 session.getTransaction().begin();
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter student id to update");
		 Employee1 employee=(Employee1)session.get(Employee1.class, sc.nextLong());
		 if(employee!=null) {
			 System.out.println("Enter new email to update");
			 employee.setEmail(sc.next());
			 session.update(employee);
			 session.flush();
			 session.getTransaction().commit();
			 System.out.println("one record updated sucessfully");
		 }
		 else {
			 System.out.println("record not found");
		 }
		
			

	}

}
