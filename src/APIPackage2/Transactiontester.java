package APIPackage2;

import java.util.*;

public class Transactiontester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transaction t1 = new Transaction("T01",934567990,76458932,12344.76);
		Transaction t2 = new Transaction("T02",768096545,67456902,9876.90);
		Transaction t3 = new Transaction("T03",64553726,76646353,87654.80);
		
		HashMap<String,Transaction> hs = new HashMap<String,Transaction>();
		hs.put(t1.getTransactionid(), t1);
		hs.put(t2.getTransactionid(), t2);
		hs.put(t3.getTransactionid(),t3);
		
		long acc = 934567990l;
		
		Transactionservice.printAllTransaction(hs, acc);

	}

}
