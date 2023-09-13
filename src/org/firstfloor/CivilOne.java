package org.firstfloor;

public class CivilOne {
	
	public void philips(int id) {
		
		System.out.println("Id is; "+id);
		
	}
	
	public void philips(String name) {
		System.out.println("Name is: "+name);
		
	}
	
	public void philips(int height,String email) {
		System.out.println("Height is: "+height);
		System.out.println("Email is: "+email);
	}
	
	public static void main(String[] args) {
		CivilOne p = new CivilOne();
		p.philips(80);
		p.philips("java");
		p.philips(150,"Niran@gmail.com");
		
		
	}
	

}
