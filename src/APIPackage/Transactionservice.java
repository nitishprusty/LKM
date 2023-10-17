package APIPackage;
import java.util.*;
public class Transactionservice {
   public static void printAllTransactions(List<Transaction> transactions,long accountNumber) {
	   System.out.println("Transaction Details are - ");
	   for(Transaction transaction : transactions) {
		   if(transaction.getSenderAccountNumber() == accountNumber || transaction.getRecipentAccountNumber() == accountNumber)
		   {
			   System.out.println(transaction.toString() + "\n");
		   }
	   }
   }
}
