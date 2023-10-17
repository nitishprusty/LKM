package APIPackage2;

import java.util.*;

public class Transactionservice {
	
	static void printAllTransaction(HashMap<String,Transaction> ts,long AccountNumber) {
		System.out.println("Transaction Details - ");
		for(Transaction t : ts.values()) {
			if(t.getRecipentAccountNumber() == AccountNumber || t.getSenderAccountNumber() == AccountNumber) {
				System.out.println(t.toString() + "\n");
			}
		}
	}

}
