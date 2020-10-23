package program;


public class Networking {
	
	String name;
	
	String lname;
	
	public Networking(String name, String lname) {
		this.name = name;
		this.lname = lname;
		
	}
	
	public void multiply(int i, int f) {
		System.out.println("From method A: " + i * f);
	}
	
	public void multiply(double f, double j) {
		System.out.println("From method B: " + f * j);
		
	}
	
	public void multiply(int t, int g, int h) {
		System.out.println("From method C: " + t * g * h);
		
	}
	
}
