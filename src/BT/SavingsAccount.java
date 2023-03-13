package BT;

public class SavingsAccount {
	private double annualInterestRate ,savingsBalance;

	public SavingsAccount() {
		this(0,0);
	}
	
	public SavingsAccount(double annualInterestRate, double savingsBalance) {
		this.annualInterestRate = annualInterestRate;
		this.savingsBalance = savingsBalance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public void calculateMonthlyInterest() {
		double monthlyInterest = (this.annualInterestRate * this.savingsBalance)/12;
		savingsBalance +=monthlyInterest;
		
	}
	
	@Override
	public String toString() {
		return "annualInterestRate= " + annualInterestRate + ", savingsBalance= " + savingsBalance ;
	}

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(0.004, 2000);
		SavingsAccount saver2 = new SavingsAccount(0.005, 3000);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println("the new balances for both savers: "+saver1);
		System.out.println("the new balances for both savers: "+saver2);

	}
}
