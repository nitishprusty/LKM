package Composition;

public class Bank {
	
	long bankAccNumber;
	String bankName;
	String bankIfscCode;
	
	public Bank(long accNum,String bname,String ifscCode) {
		this.bankAccNumber = accNum;
		this.bankName = bname;
		this.bankIfscCode = ifscCode;
	}
	public long getBankAccNumber() {
		return bankAccNumber;
	}
	public void setBankAccNumber(long bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankIfscCode() {
		return bankIfscCode;
	}
	public void setBankIfscCode(String bankIfscCode) {
		this.bankIfscCode = bankIfscCode;
	}
	
	

}
