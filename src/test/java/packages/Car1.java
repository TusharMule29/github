package packages;

public class Car1 extends Vehicle1 {

	String model;
	
	void calcmilegae() {
		
		System.out.println(" this  is  calcmilege method in  car class method");
		
	}
	void show() {
		System.out.println(" this is show method in car class");
	}
	
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}

	public static void main(String[] args) {
		Vehicle1 c = new Car1();
 	c.setColor("white");
 	c.setPrice(130000);

	System.out.println(c.getColor());
	System.out.println(c.getPrice());
	c.calcAvg();
		c.show();
		System.out.println(" c.price : " + c.price);
		System.out.println(" c.color : " + c.color);
		
		
		
		
		
		
		
	}

}
