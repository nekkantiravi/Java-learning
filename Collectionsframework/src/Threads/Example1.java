package Threads;

public class Example1 extends Thread {

	public void run() {
		System.out.println("Thread started");
	}

	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.start();
	}
}
