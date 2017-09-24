
public class SingleThreadDemo {

	public static void main(String[] args) {
		
		SingleThreadDemo obj = new SingleThreadDemo();
		obj.displayNumbers();
		
		for (int j = 0; j <= 200; j++) {
			System.out.println("j: "+j);
		}
		
	}

	private void displayNumbers() {
		for (int i = 0; i <= 200; i++) {
			System.out.println("i: "+i);
		}
	}
	
}
