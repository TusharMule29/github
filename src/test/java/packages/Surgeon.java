package packages;

public class Surgeon extends Doctor  {
String name;
	int fees = 1244;
	Surgeon(){
		super();// default parent constructor is called;;;;
		System.out.println("Surgeon constructor");

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	void show() {
		
		
		System.out.println(" this.fees : " + this.fees+super.hashCode() );
	
	
	}
	
	public static void main(String[] args) {
 Surgeon s = new Surgeon();
 System.out.println(s.fees);
System.out.println( s.getfee());
 }
		
		
		
		
	}


