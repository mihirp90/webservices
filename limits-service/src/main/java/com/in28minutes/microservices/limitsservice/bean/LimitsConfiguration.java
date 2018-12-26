package com.in28minutes.microservices.limitsservice.bean;

public class LimitsConfiguration {
	
	private int minimum;
	private int maximum;
	
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public LimitsConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public LimitsConfiguration() {
		super();
	}
	
	
}
