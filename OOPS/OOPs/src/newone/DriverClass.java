package newone;

public class DriverClass  {

	public static void main(String[] args) {
		Account account = new Account();
		System.out.println(account.currentblc);
		 SavingsAccount savAcc = new SavingsAccount();
		 savAcc.withdrawal(500);
			System.out.println(account.currentblc);
		System.out.println(savAcc.deposition(1500));

	}

}
