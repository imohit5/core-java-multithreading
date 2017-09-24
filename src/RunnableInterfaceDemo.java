
public class RunnableInterfaceDemo implements Runnable {

	public static void main(String[] args) {

		RunnableInterfaceDemo obj = new RunnableInterfaceDemo();

		Thread th = new Thread(obj);
		th.start();
	}

	@Override
	public void run() {
		System.out.println("Inside Run method");
	}

}
