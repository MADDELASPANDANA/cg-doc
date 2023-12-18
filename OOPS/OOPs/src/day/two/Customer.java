package day.two;

public class Customer {
	static int id;
	private String firstName;
	private String lastName;
	private Address address;//Has-A Relationship
	private double balance;
	
	public Customer(){}
	
	public Customer(String firstName, String lastName, Address address, double balance) {
		super();
		id++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", balance=" + balance + "]";
	}
}
