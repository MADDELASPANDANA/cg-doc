package day.three;

public class BankApp {
	private Customer customers[] = new Customer[50];
	static int index = 0;
	public int addCustomer(Customer customer){
		customers[index++] = customer;
		return customer.getId();
		
	}
	public Customer[] displayAllCustomers(){
		return customers;
	}

}
