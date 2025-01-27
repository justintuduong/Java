package com.codingdojo.phone;

public abstract class Phone {
	private String versionNumber;
	private int batteryPercentage;
	private String carrier;
	private String ringTone;
	public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.ringTone = ringTone;
	}
	// abstract method. This method will be implemented by the subclasses
	public abstract void displayInfo();
	// getters and setters removed for brevity. Please implement them yourself
	
	
//	-----------------------------------------------------------------------------------------------
//	getters/setters
//	-----------------------------------------------------------------------------------------------
	
	public String getVersionNumber() {
		return versionNumber;
	}
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}
	public int getBatteryPercentage() {
		return batteryPercentage;
	}
	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getRingTone() {
		return ringTone;
	}
	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}
//	-----------------------------------------------------------------------------------------------
//	Overrides
//	-----------------------------------------------------------------------------------------------
	
	public String ring() {
		// TODO Auto-generated method stub
		System.out.println("ring in overrides from Phone");
		return null;
	}
	public String unlock() {
		// TODO Auto-generated method stub
		System.out.println("unlock in overrides from Phone");
		return null;
	}

}
