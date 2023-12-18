package newone;

public class CurrentAccount extends Account {

	public void withdrawal(float amount) {
		
		double withdraw = currentblc-amount;
		if(currentblc >=0) {
			System.out.println("Total blc in account is " + currentblc);
			
		}else {
			System.out.println("Low balance");
		}
	}
	public double deposition(float amount) {
		currentblc++;
		double deposite= currentblc + amount;
		return  deposition(amount);
	}
}
