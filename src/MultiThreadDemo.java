
public class MultiThreadDemo extends Thread {

	public static void main(String[] args) throws InterruptedException {
		
		MultiThreadDemo obj = new MultiThreadDemo();
		obj.start();
		
		for (int j = 0; j <= 200; j++) {
			System.out.println("j: "+j);
			Thread.sleep(1000);
		}
		
	}
	
	@Override
	public void run() {
		for (int i = 0; i <= 200; i++) {
			System.out.println("i: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("run thread exception occured");
			}
		}
	}
	
}
