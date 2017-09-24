package synchronizedExample.classLock;

public class synchronizedDisplayDemo {

	public void sendMessage(String name) {

//		synchronized (this) for block lock
//		synchronized (synchronizedDisplayDemo.class) for class lock
//		synchronized (new String()) for object lock
		synchronized (this) {

			for (int i = 0; i <= 10; i++) {
				System.out.println("Hello Synchronized message, " + name);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Interruption occured");
				}
			}
		}

	}

}
