package bank;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("Deposit2");
	}
	

	public static void main(String[] args) {
		
		AxisBank bank = new AxisBank(); 
		bank.savings();
		bank.fixed();
		bank.deposit();

	}

}
