package interruptExample;

public class InterruptDemo extends Thread {
	
	@Override
	public void run() {
		
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println("lazy thread: "+i);
				Thread.sleep(1000);	
			}
		} catch (InterruptedException e) {
			System.out.println("Interruption occured");
		}
		
		
	}

}
