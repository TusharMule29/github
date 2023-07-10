package packages;

public class Parent {

	String name;
	int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	void calcAvg() {
		 System.out.println(" this is parent class method");
	}
	void show() {
		 System.out.println(" this is parent class method ");
		System.out.println(" this is shown mehtod in parent class" + this.getName() + this.getPrice() );
		
	}
	
}
