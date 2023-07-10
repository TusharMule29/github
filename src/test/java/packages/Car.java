package packages;

public class Car  extends Parent{
	
	String model;
	int price=12;
	public float calcMileage() {
		
		return 11.5f;
	}

	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}

	@Override
	
   void show() {
	System.out.println(" this is car class method");
	System.out.println(this.getModel() + " : " + this.getPrice());
}

	public static void main(String[] args) {
 
  Car c = new Car();
  c.setName("tushar");
  		
 System.out.println(" c.Name : " + c.getName());
 c.setPrice(1200);
 System.out.println(" c.Price : " + c.price);
 c.calcAvg();
 c.calcMileage();
 System.out.println( " c .model : " +  c.model);
 c.setModel("kia");
 
 c.show();
		
		
		
		
	}

}
