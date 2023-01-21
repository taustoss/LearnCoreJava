package com.tutorial.inheritence;

public class Wheel {
	
	int psi = 32;
	public String type;
	public int getPsi() {
		return psi;
	}
	public void setPsi(int psi) {
		this.psi = psi;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Wheel [psi=" + psi + ", type=" + type + "]";
	}
	
	

}
