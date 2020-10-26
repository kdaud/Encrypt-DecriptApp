package SweetMary;

import java.util.Scanner;

public class Valuable {
	
	static {
		System.out.println("Enter the name: ");
	}
	
	Scanner scanner = new Scanner(System.in);
	
	private void marriage() {
		
		String messageString = scanner.nextLine();
		System.out.println("*******************************************************************************");
		System.out.println(" Many daughters have done virtuously, But **" + messageString + "** excel them all");
	}
	
	public static void main(String[] args) {
		new Valuable().marriage();
		System.out.println("*******************************************************************************");
	}
}
