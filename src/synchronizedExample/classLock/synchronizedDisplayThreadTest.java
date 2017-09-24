package synchronizedExample.classLock;

public class synchronizedDisplayThreadTest extends Thread {

	public static void main(String[] args) {
		synchronizedDisplayDemo sdd = new synchronizedDisplayDemo();
		
		
		synchronizedDisplayThread sdt1 = new synchronizedDisplayThread(sdd,"Tim");
		sdt1.start();
		synchronizedDisplayThread sdt2 = new synchronizedDisplayThread(sdd,"Tom");
		sdt2.start();
		
	}

}
