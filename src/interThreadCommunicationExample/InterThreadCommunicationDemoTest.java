package interThreadCommunicationExample;

public class InterThreadCommunicationDemoTest {
	
	public static void main(String[] args) {
		InterThreadCommunicationDemo itc = new InterThreadCommunicationDemo();
		itc.start();
		
		synchronized (itc) {
			System.out.println("main thread is going to wait");
			try {
				itc.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("notification done");
			System.out.println(itc.total);
			
		}
	}

}
