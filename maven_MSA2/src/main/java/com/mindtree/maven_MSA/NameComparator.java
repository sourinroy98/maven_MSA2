package com.mindtree.maven_MSA;

import java.util.Comparator;

public class NameComparator implements Comparator<Customer>
{

	@Override
	public int compare(Customer c3, Customer c4) {
		
		return c3.getCus_name().compareTo(c4.getCus_name());
	}
	
	

}
