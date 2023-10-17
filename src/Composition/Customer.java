package Composition;

public class Customer {
	
	String customerName;
	Bank bank;
	
	public Customer(String cName,Bank bank) {
		this.customerName = cName;
		this.bank = bank;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public static void main(String[] args) {
		
		Bank bank = new Bank(1556678903,"HDFC","HDF234");
		Customer cus = new Customer("Nitish",bank);
		System.out.println("Customer Name - " + cus.getCustomerName());
		System.out.println("BankAccount Number - " + cus.getBank().getBankAccNumber());
		System.out.println("Bank Name - " + cus.getBank().getBankName());
		System.out.println("Bank IfscCode - " + cus.getBank().getBankIfscCode());

	}

}
