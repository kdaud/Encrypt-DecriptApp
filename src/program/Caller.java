package program;


public class Caller {
	

	public static void main(String[] args) {
		Networking obj = new Networking("Daud", "Kakumirizi");
		System.out.println(obj.name + " " + obj.lname);
		obj.multiply(3, 6, 6);
	}
	
}
