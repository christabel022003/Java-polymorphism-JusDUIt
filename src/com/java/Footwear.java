package com.java;

public class Footwear {
	String name;
	String type;
	int price = 0;
	
	public Footwear(String name, String type, int price) {
		
		this.name = name;
		this.type = type;
		this.price = price;

}

	public void detail() {
		
		
	}

	public static Footwear get(int i) {
		
		return null;
	}
	
protected void detail1() {
		
		System.out.println("Footwear Name " + getName());
		System.out.println("Footwear Price " + getPrice());
		System.out.println("Footwear Type " + getType());
	}

private String getType() {
	
	return type;
}

private int getPrice() {
	
	return price;
}

private String getName() {
	
	return name;
}

}
