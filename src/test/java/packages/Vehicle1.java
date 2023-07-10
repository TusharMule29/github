package packages;

public class Vehicle1 {

	String color = " black";
	int price= 129030;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	void show() {
		System.out.println(" this is Parent class");
		
	}

	void calcAvg() {
		System.out.println(" this is parent calss method " );
	}

}
