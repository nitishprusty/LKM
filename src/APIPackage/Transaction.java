package APIPackage;

public class Transaction {
	
   private String transactionid;
   private long senderAccountNumber;
   private long recipentAccountNumber;
   public String getTransactionid() {
	return transactionid;
}

public void setTransactionid(String transactionid) {
	this.transactionid = transactionid;
}

public long getSenderAccountNumber() {
	return senderAccountNumber;
}

public void setSenderAccountNumber(long senderAccountNumber) {
	this.senderAccountNumber = senderAccountNumber;
}

public long getRecipentAccountNumber() {
	return recipentAccountNumber;
}

public void setRecipentAccountNumber(long recipentAccountNumber) {
	this.recipentAccountNumber = recipentAccountNumber;
}

public double getTransactionAmount() {
	return transactionAmount;
}

public void setTransactionAmount(double transactionAmount) {
	this.transactionAmount = transactionAmount;
}

private double transactionAmount;
   
   public Transaction(String transactionid,long senderAccountNumber,long recipentAccountNumber,double transactionAmount) {
	   this.transactionid = transactionid;
	   this.senderAccountNumber = senderAccountNumber;
	   this.recipentAccountNumber = recipentAccountNumber;
	   this.transactionAmount = transactionAmount;
   }
   
   public String toString() {
	   return transactionid + " " + senderAccountNumber + " " + recipentAccountNumber + " " + transactionAmount;
   }
}
