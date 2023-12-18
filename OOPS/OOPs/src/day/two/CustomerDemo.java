package day.two;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer("PASHA","MD",new Address("20-20", "EAST", "MUMBAI"),9999.99);
		System.out.println(c1);
		c1.setBalance(7777.77);//it is customers property
		
		//c1.setAddress("30-30, EAST, MUMBAI");
		
		c1.getAddress().setDoorNo("50-50");//door no is the property of address
		System.out.println(c1);
		
	}

}
