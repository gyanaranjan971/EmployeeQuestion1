package model;

import java.util.Scanner;

public class MainMethod {

	  public static void select() {
		  System.out.println("1.insert"+"\n"+"2.display"+"\n"+"3.update"+"\n"+"4.delete");
		  Scanner sc=new Scanner(System.in);
		  int input =sc.nextInt();
		  switch(input)
		  {
		  case 1:
			  Tester test= new Tester();
			test. insertMethod();
			System.out.println("data inserted successfully");
			  break;
		  case 2:
			  Tester1 test1= new Tester1();
			test1. display();
			  break;
		  case 3:
			  Tester2 test2= new Tester2();
			test2. updateMethod();
			  break;
		  case 4:
			  Tester3 test3= new Tester3();
			test3.deleteData();
			  break;
			  default:
				  System.out.println("inavlid section select again");
				  break;
		  }
	  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	while(true) {
		select() ;
		System.out.println("enter 1 to continue or 0 to exit");
		int choice=sc.nextInt();
		if(choice==0)
			break;

	}
	}
}
