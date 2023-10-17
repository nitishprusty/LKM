package AggregationDemo;

public class Driver {
    String driverName;
    Car car; //Has A relationship 
    
    //Aggregation
    
    public Driver(String drivername, Car car) {
    	//super();
    	this.driverName = drivername;
    	this.car = car;
    }
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	public static void main(String [] args) {
		Car car = new Car("BMW",new java.util.Date(System.currentTimeMillis()));
		Driver driver = new Driver("Neeraj",car);
		System.out.println("Driver Name - " + driver.getDriverName());
		System.out.println("Car Name - " + car.getCarname());
		//System.out.println("Purchase Date - " + car.getPurchaseDate());
		
	}
    
}
