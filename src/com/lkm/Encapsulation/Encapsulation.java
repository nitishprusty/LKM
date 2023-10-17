package com.lkm.Encapsulation;

public class Encapsulation {
	
	String cW,password;
	public String getcW() {
		return cW;
	}

	public void setcW(String cW) {
		this.cW = cW;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getCarNum() {
		return carNum;
	}

	public void setCarNum(long carNum) {
		this.carNum = carNum;
	}

	long carNum;
	
	public Encapsulation(String Cw,String password,long carNum) {
		this.carNum = carNum;
		this.cW = Cw;
		this.password = password;
	}

	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation("456","qwerty",748649668);
		
		System.out.println(obj.getCarNum());
		System.out.println(obj.getcW());
		System.out.println(obj.getPassword());

	}

}
