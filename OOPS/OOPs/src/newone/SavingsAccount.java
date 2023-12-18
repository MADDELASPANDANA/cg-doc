package newone;

public class SavingsAccount extends Account {

	float amount;
	
	public double withdrawal(float amount) {
		double withdraw = currentblc-amount;
		if(currentblc >=0) {
			System.out.println("Total blc in account is " + currentblc);
			
		}else {
			System.out.println("Low balance");
		}
		return withdraw;
		
	}
	public double deposition(float amount) {
		currentblc++;
		double deposite= currentblc + amount;
		return deposite;
		
	}
	
}