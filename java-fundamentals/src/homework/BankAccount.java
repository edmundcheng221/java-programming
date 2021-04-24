package homework;

public class BankAccount {
	
	private String accountNumber;
	private String lastName;
	private String firstName;
	private String taxIDNumber;
	private double checkingBalance;
	private double minCheckingBalance;
	private double maxCheckingWithdrawal;
	private double savingsBalance;
	private double minSavingBalance;
	private double maxSavingWithdrawal;
	private double savingsInterestRate;
	private static int AccountCount = 1;
	
	
	public BankAccount(String lastName, String firstName, String taxIDNumber, double checkingBalance, double savingsBalance, double savingsInterestRate) {
		this.accountNumber = "A-00" + AccountCount;
		this.lastName = lastName;
		this.firstName = firstName;
		this.taxIDNumber = taxIDNumber;
		if (checkingBalance > 1000 && savingsBalance > 500) {

			this.checkingBalance = checkingBalance;
			this.savingsBalance = savingsBalance;
			this.savingsInterestRate = savingsInterestRate;
			this.minCheckingBalance = 0.25 * checkingBalance;
			this.maxCheckingWithdrawal = 0.40 * checkingBalance;
			this.minSavingBalance = 0.55 * savingsBalance;
			this.maxSavingWithdrawal = 0.20 * savingsBalance;
			
			System.out.println("Account " + accountNumber + " HAS BEEN CREATED");
			AccountCount += 1;
		}
		else {
			AccountCount += 1;
			System.out.println("Account " + accountNumber + " IS PENDING ADDITONAL FUNDS");
			this.checkingBalance = 0;
			this.savingsBalance = 0;
		}
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = "A-00" + AccountCount;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getTaxIDNumber() {
		return taxIDNumber;
	}

	public void setTaxIDNumber(String taxIDNumber) {
		this.taxIDNumber = taxIDNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getMinCheckingBalance() {
		return minCheckingBalance;
	}

	public void setMinCheckingBalance(double minCheckingBalance) {
//		this.minCheckingBalance = 0.25 * checkingBalance;
		this.minCheckingBalance = minCheckingBalance;
	}

	public double getMaxCheckingWithdrawal() {
		return maxCheckingWithdrawal;
	}

	public void setMaxCheckingWithdrawal(double maxCheckingWithdrawal) {
		this.maxCheckingWithdrawal = maxCheckingWithdrawal;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public double getMinSavingBalance() {
		return minSavingBalance;
	}

	public void setMinSavingBalance(double minSavingBalance) {
		this.minSavingBalance = minSavingBalance;
	}

	public double getMaxSavingWithdrawal() {
		return maxSavingWithdrawal;
	}

	public void setMaxSavingWithdrawal(double maxSavingWithdrawal) {
		this.maxSavingWithdrawal = maxSavingWithdrawal;
	}

	public double getSavingsInterestRate() {
		return savingsInterestRate;
	}

	public void setSavingsInterestRate(double savingsInterestRate) {
		this.savingsInterestRate = savingsInterestRate;
	}

	public static int getAccountCount() {
		return AccountCount;
	}

	public static void setAccountCount(int accountCount) {
		AccountCount = accountCount;
	}
	
	
	public void displayAccountInfo() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Name on Account: " + firstName + " " + lastName);
		System.out.println("Tax ID Number: " + taxIDNumber);
		System.out.println("_____________BALANCES_____________");
		System.out.println("          Checking: $" + checkingBalance);
		System.out.println("          Savings: $" + savingsBalance);
		System.out.println("_____________ALLOWANCES_____________");
		
		System.out.println("Minimum Checking Balance: $" + minCheckingBalance);
		System.out.println("Maximum Checking Withdrawal: $" + maxCheckingWithdrawal);
		System.out.println("Minimum Savings Balance: $" + minSavingBalance);
		System.out.println("Maximum Savings Withdrawal: $" + maxSavingWithdrawal);
		System.out.println("-------------------------------------------------------------------------");
	}
	
	public boolean depositToChecking(double d) {
		checkingBalance += d;
		System.out.println("$" + d + " deposited to Checking");
		return true;
	}
	
	public boolean depositToSavings(double d) {
		savingsBalance += d;
		System.out.println("$" + d + " deposited to Savings");
		return true;
	}
	
	public boolean withdrawFromChecking(double d) {
		if((d <= checkingBalance) && (checkingBalance - d >= minCheckingBalance)) {
			checkingBalance -= d;
			System.out.println("$" + d + " widthdrawn from Checking");
			return true;
		}
		else {
			System.out.println("Withdraw cannot be made");
			return false;
		}
		
	}
	
	public boolean withdrawFromSavings(double d) {
		if((d <= savingsBalance) && (savingsBalance - d >= minSavingBalance)) {
			savingsBalance -= d;
			System.out.println("$" + d + " widthdrawn from Savings");
			return true;
		}
		else {
			System.out.println("Withdraw cannot be made");
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		// Task: Object Creation
		
		BankAccount B1 = new BankAccount("Johnson","Bobby","123456",2390.00,3400.00,2);
		
		BankAccount B2 = new BankAccount("Thomas","Richard","654888",5360.00,5400.00,2.5);
		
		BankAccount B3 = new BankAccount("Turner","James","622898",360.00,5400.00,2.1);
		
		System.out.println("Task 1");
		
		B1.depositToChecking(100.32);
		
		System.out.println("Task 2");
		
		B1.depositToSavings(2000.00);
		
		System.out.println("Task 3");
		
		B1.withdrawFromChecking(90.00);
		
		System.out.println("Task 4");
		
		B1.displayAccountInfo();
		
		System.out.println("Task 5");
		
		B2.depositToChecking(1230.02);
		
		System.out.println("Task 6");
		
		B2.depositToSavings(1000.00);
		
		System.out.println("Task 7");
		
		B2.withdrawFromSavings(765.00);
		
		System.out.println("Task 8");
		
		B2.displayAccountInfo();
		
		System.out.println("Task 9");
		
		B3.displayAccountInfo();

	}

	

}





















