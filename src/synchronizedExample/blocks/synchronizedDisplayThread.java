package synchronizedExample.blocks;

public class synchronizedDisplayThread extends Thread {

	public synchronizedDisplayThread(String name) {
		this.name = name;
	}

	String name;

	
	@Override
	public void run() {
		synchronizedDisplayDemo.sendMessage(name);
	}

}
