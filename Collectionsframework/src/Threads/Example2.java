package Threads;

public class Example2 implements Runnable {

	public void run() {
		// System.out.println("Thread started");
		for (int i = 0; i < 6; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Example2 obj = new Example2();
		Thread obj1 = new Thread(obj);
		Thread obj2 = new Thread(obj);
		Thread obj3 = new Thread(obj);
		obj1.start();
		try {
			obj1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		obj2.start();
		obj3.start();
	}
}
