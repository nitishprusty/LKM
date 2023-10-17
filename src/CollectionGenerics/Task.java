package CollectionGenerics;

import java.util.*;

class Training {
	private String training_name;
	private String Location;
	private int participants;
	
	
	public Training(String training_name,String Location,int participants) {
		this.training_name = training_name;
		this.Location = Location;
		this.participants = participants;
	}


	public String getTraining_name() {
		return training_name;
	}


	public void setTraining_name(String training_name) {
		this.training_name = training_name;
	}


	public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		Location = location;
	}


	public int getParticipants() {
		return participants;
	}


	public void setParticipants(int participants) {
		this.participants = participants;
	}
	
}

public class Task {

	public static void main(String[] args) {
		//Training name
		//Location
		//Number of participants
		
		List<Training> al = new ArrayList<Training>();
		Training t1 = new Training("Java","Kolkata",25);
		Training t2 = new Training("Salesforce","Mumbai",15);
		Training t3 = new Training("Cloud","Banglore",14);
		Training t4 = new Training("SAP","Chennai",18);
		
		al.add(t1);
		al.add(t2);
		al.add(t3);
		al.add(t4);
		
		for(Training t : al) {
			System.out.println(t.getTraining_name());
			System.out.println(t.getParticipants());
			System.out.println(t.getLocation());
		}

	}

}
