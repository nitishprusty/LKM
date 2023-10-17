package Inheritence;

public class Accenture {
	
	String location;
	String Stream;
	int comp_code;
	
	public Accenture(int comp_code,String location,String Stream) {
		this.comp_code = comp_code;
		this.Stream = Stream;
		this.location = location;
		
		System.out.println(comp_code + "\n" + Stream + "\n" + location);
	}
   
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStream() {
		return Stream;
	}

	public void setStream(String stream) {
		Stream = stream;
	}

	public int getComp_code() {
		return comp_code;
	}

	public void setComp_code(int comp_code) {
		this.comp_code = comp_code;
	}

	public Accenture() {
		System.out.println("Learning Java");
	}
}
