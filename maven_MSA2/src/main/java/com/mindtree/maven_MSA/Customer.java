package com.mindtree.maven_MSA;

public class Customer {
	
	private int cus_id;
	private int cus_age;
	private String cus_name;
	private double purchase_ammount;
	public Customer(int cus_id, int cus_age, String cus_name, double purchase_ammount) {
		super();
		this.cus_id = cus_id;
		this.cus_age = cus_age;
		this.cus_name = cus_name;
		this.purchase_ammount = purchase_ammount;
	}
	public int getCus_id() {
		return cus_id;
	}
	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}
	public int getCus_age() {
		return cus_age;
	}
	public void setCus_age(int cus_age) {
		this.cus_age = cus_age;
	}
	public String getCus_name() {
		return cus_name;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	public double getPurchase_ammount() {
		return purchase_ammount;
	}
	public void setPurchase_ammount(double purchase_ammount) {
		this.purchase_ammount = purchase_ammount;
	}
	@Override
	public String toString() {
		return "Customer [cus_id=" + cus_id + ", cus_age=" + cus_age + ", cus_name=" + cus_name + ", purchase_ammount="
				+ purchase_ammount + "]";
	}
	

}
