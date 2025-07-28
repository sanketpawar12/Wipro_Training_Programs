package day7;

class Mul3 implements Runnable{
	public void run() {
		for(int i = 0; i < 10; i++) {
		System.out.println("This is Sanket");
		try {
			Thread.sleep(10);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

class Mul4 implements Runnable{
	public void run() {
		for(int i =0; i< 10; i++) {
			System.out.println("This is a new program");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MuliThreadingTwo {	
	public static void main(String[] args) {
		Runnable m3 = new Mul3();
		Runnable m4 = new Mul4();
//		System.out.println(m2.getPriority());
//		m2.setPriority(Thread.MAX_PRIORITY);
		
		Thread t1 = new Thread(m3);
		Thread t2 = new Thread(m4);
		
		t1.start();
		t2.start();
		
	}
}
