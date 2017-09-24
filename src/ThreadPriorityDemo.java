
public class ThreadPriorityDemo extends Thread {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadPriorityDemo obj = new ThreadPriorityDemo();
		obj.setName("Testing Thread Name 1");
		obj.setPriority(MAX_PRIORITY);
		obj.start();
		
		ThreadPriorityDemo obj2 = new ThreadPriorityDemo();
		obj2.setName("Testing Thread Name 2");
		obj.setPriority(MIN_PRIORITY);
		obj2.start();
		
		
		
		
	}
	
	@Override
	public void run() {
		
		Thread currentThread = Thread.currentThread();
		System.out.println("name of the thread in run: "+currentThread.getName());
		
	}
	
}
