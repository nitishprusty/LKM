package Casting;

public class DynamicUnpCasting extends Accenture{
	
	void project(String s) {
		System.out.println(s);
	}
	
	{
		System.out.println(EID);
	}
	
	public static void main(String [] args) {
		Accenture acc = new DynamicUnpCasting(); //Upcasting
		acc.project(879008937);
		
		DynamicUnpCasting obj = (DynamicUnpCasting)acc;  //Downcasting
		obj.project("Hybrid");
		obj.project(7687654);
		obj.EID = "673675357";
		
	}

}
