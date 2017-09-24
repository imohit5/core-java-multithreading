package synchronizedExample;

public class synchronizedDisplayDemo {

	public synchronized void sendMessage(String name) {

		for (int i = 0; i <= 10; i++) {
			System.out.println("Hello Synchronized message, "+name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interruption occured");
			}
		}
	}
	
}
