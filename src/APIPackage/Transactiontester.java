package APIPackage;

import java.util.*;

public class Transactiontester {

	public static void main(String[] args) {
		
		Transaction t1 = new Transaction("T01",934567990,76458932,12344.76);
		Transaction t2 = new Transaction("T02",768096545,67456902,9876.90);
		Transaction t3 = new Transaction("T03",64553726,76646353,87654.80);
		
		List<Transaction> at = new ArrayList<Transaction>();
		at.add(t1);
		at.add(t2);
		at.add(t3);
		
		Transactionservice.printAllTransactions(at, 934567990);
		

	}

}
