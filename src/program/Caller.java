package program;


public class Caller {
	

	public static void main(String[] args) {
		Networking obj = new Networking("Daud", "Kakumirizi");
		System.out.println(obj.name + " " + obj.lname);
		System.out.println("Hello Programming");
		obj.multiply(3, 6, 6);
	}
	
}
