import java.util.Random;

class T1 extends Thread {

	Random rand = new Random();

	public void run() {
		System.out.println("The thread is started!");
		for (int i = 0; i < 6; i++) {

			try {
				Thread.sleep(1000 * (rand.nextInt(10)));
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}
		System.out.println("The thread complete!");
	}
}

public class Main {

	public static void main(String[] args) {

		T1 t1 = new T1();
		T1 t2 = new T1();
		T1 t3 = new T1();
		T1 t4 = new T1();
		T1 t5 = new T1();

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		System.out.println("Thread" + t1.getName());
		System.out.println("Thread" + t2.getName());
		System.out.println("Thread" + t3.getName());
		System.out.println("Thread" + t4.getName());
		System.out.println("Thread" + t5.getName());

	}
}
