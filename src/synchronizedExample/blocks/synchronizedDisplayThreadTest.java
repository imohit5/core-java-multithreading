package synchronizedExample.blocks;

public class synchronizedDisplayThreadTest extends Thread {

	public static void main(String[] args) {
		synchronizedDisplayDemo sdd = new synchronizedDisplayDemo();
		
		
		synchronizedDisplayThread sdt1 = new synchronizedDisplayThread("Tim");
		sdt1.start();
		synchronizedDisplayThread sdt2 = new synchronizedDisplayThread("Tom");
		sdt2.start();
		
	}

}
