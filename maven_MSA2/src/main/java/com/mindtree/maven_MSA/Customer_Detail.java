package com.mindtree.maven_MSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class Customer_Detail 
{
	
	public static void main(String[] args) 
	{
		List<Customer> c1 = new ArrayList<>();
		
		c1.add(new Customer(1, 20, "Atul", 500));
		c1.add(new Customer(2, 23, "Saini", 1500));
		c1.add(new Customer(3, 21, "Ramesh", 1000));
		c1.add(new Customer(4, 19, "Naveen", 1200));
		c1.add(new Customer(5, 17, "Brijesh", 1700));
		c1.add(new Customer(6, 24, "Cayan", 2500));
		c1.add(new Customer(7, 22, "Deba", 700));
		c1.add(new Customer(8, 28, "Kalyan", 3500));
		c1.add(new Customer(9, 30, "Jack", 800));
		c1.add(new Customer(10, 29, "Manish", 400));
		
		Scanner s1=new Scanner(System.in);
		int choise;
		
		do {
			
			System.out.println("1.Display all the customers: ");
			System.out.println("2.Display the customer in ascending order by their name: ");
			System.out.println("3.update the Customer details");
			System.out.println("Enter your choise");
			choise=s1.nextInt();
			
			switch (choise) {
			case 1:
				System.out.println("--------------------");
				
				for(Customer c:c1)
					System.out.println(c);
				
				System.out.println("--------------------");
				
				break;
				
			case 2:
				System.out.println("--------------------");
				
				List<Customer> l2=new ArrayList<>(c1);
				Collections.sort(l2, new NameComparator());
				for(Customer c2:l2)
				{
					System.out.println(c2);
				}
				
				System.out.println("--------------------");
				break;
				
			case 3:
				System.out.println("---------------------------");
				
				boolean found=false;
				System.out.print("Enter the id to update: ");
				int id1=s1.nextInt();
				
				ListIterator<Customer> li = c1.listIterator();
				while(li.hasNext())
				{
					Customer cm = li.next();
					if(cm.getCus_id()==id1)
					{
						System.out.print("Enter age: ");
					    int cus_age = s1.nextInt();
						
						System.out.print("Enter the name: ");
						String cus_name = s1.next();
						
						System.out.print("Enter the puchasing ammount: ");
						int purchase_ammount = s1.nextInt();
						
						li.set(new Customer(id1, cus_age, cus_name, purchase_ammount));
						found=true;
					}
				}
				if(!found)
					System.out.println("Customer not in the list");
				else
					System.out.println(".......Udated successfully......");
				
				System.out.println("---------------------------");
				break;

			
			}
			
		} while (choise!=0);
		s1.close();
	}

}
