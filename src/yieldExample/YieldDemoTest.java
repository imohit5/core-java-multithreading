package yieldExample;

public class YieldDemoTest {

	public static void main(String[] args) {

		YieldDemo yd = new YieldDemo();
		yd.start();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("main i: "+i);
		}
	}

}
