package model;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Tester1 {

	public static void display() {
		Configuration configuration=new Configuration();
		 configuration.configure("hibernate.cfg.xml");
		 System.out.println("works");
		 SessionFactory factory=configuration.buildSessionFactory();
		 Session session=factory.openSession();
		 session.getTransaction().begin();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter employee  id to display");
		long a= sc.nextLong();
		 Employee1 employee=(Employee1)session.load(Employee1.class,a);
		  List<Employee1> list = session.createQuery("from Employee1").getResultList();
		  int flag=0;
for(Employee1 s:list) {
	if(a==s.getId()) {
		 System.out.println("employee id is"+employee.getId());
		 System.out.println("employee first name is "+employee.getFirstName());
		 System.out.println("employee last name is "+employee.getLastName());
		 System.out.println("employee email is "+employee.getEmail());
	}
	else {
		flag=1;
	}
}
          if(flag==1)
        	  System.out.println("entered wrong id");
	}

}

