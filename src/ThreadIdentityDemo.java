
public class ThreadIdentityDemo extends Thread {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadIdentityDemo obj = new ThreadIdentityDemo();
		//obj.setName("Testing Thread Name");
		obj.start();
		
		Thread currentThread = Thread.currentThread();
		System.out.println("name of the thread in main: "+currentThread.getName());
		
		
		
	}
	
	@Override
	public void run() {
		
		Thread currentThread = Thread.currentThread();
		currentThread.setName("Testing Thread Name");
		System.out.println("name of the thread in run: "+currentThread.getName());
		
	}
	
}
