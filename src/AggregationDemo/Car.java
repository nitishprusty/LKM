package AggregationDemo;

import java.util.Date;

public class Car {
	
	String Carname;
	Date purchaseDate;
	
	public Car(String CarName,Date purchaseDate) {
		//super();
		this.Carname = CarName;
		this.purchaseDate = purchaseDate;
	}
	public String getCarname() {
		return Carname;
	}
	public void setCarname(String carname) {
		Carname = carname;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

}
