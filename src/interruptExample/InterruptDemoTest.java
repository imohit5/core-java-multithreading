package interruptExample;

public class InterruptDemoTest {

	public static void main(String[] args) {

		InterruptDemo yd = new InterruptDemo();
		yd.start();
		yd.interrupt();
		for (int i = 0; i <= 10; i++) {
			System.out.println("main i: "+i);
		}
	}

}
