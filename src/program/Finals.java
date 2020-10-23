package program;


public class Finals {
	
	char f;
	
	private void myCode() {
		f = 'a';
		while (f <= 'z') {
			System.out.print(f);
			f++;
		}
		
	}
	
	public static void main(String[] args) {
		new Finals().myCode();
	}
	
}
