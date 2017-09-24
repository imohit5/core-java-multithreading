import java.util.Scanner;

public class ThreadJoinDemo extends Thread {

	static int number,result = 0;
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();

		System.out.println("Sum of first 'N' numbers");
		System.out.println("Enter a value");
		
		Scanner scanner = new Scanner(System.in);
		ThreadJoinDemo.number = scanner.nextInt();
		
		ThreadJoinDemo obj = new ThreadJoinDemo();
		obj.start();
		//join will make sure run method execution is completed before executing the code after join
		try {
			obj.join();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException in join");
		}
		
		System.out.println("Result is: "+ThreadJoinDemo.result);
		
		long stop = System.currentTimeMillis();
		
		System.out.println("Time Taken is: "+(stop-start)/1000+"sec");
		
	}

	@Override
	public void run() {
		for (int i = 1; i <= ThreadJoinDemo.number; i++) {
			ThreadJoinDemo.result += i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("InterruptedException in run");
			}
		}
	}
}
