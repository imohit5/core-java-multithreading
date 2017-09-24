package interThreadCommunicationExample;

public class InterThreadCommunicationDemo extends Thread {
	
	int total=0;
	
	public void run() {
		System.out.println("processing result");
		synchronized (this) {
			for (int i = 0; i <= 100; i++) {
				total += i;
			}
			this.notify();
		}
		
	}

}
