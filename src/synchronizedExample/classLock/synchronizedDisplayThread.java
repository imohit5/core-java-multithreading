package synchronizedExample.classLock;

public class synchronizedDisplayThread extends Thread {

	synchronizedDisplayDemo sdd;
	String name;

	public synchronizedDisplayThread(synchronizedDisplayDemo sdd, String name) {
		this.sdd = sdd;
		this.name = name;
	}

	@Override
	public void run() {
		sdd.sendMessage(name);
	}

}
