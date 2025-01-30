package singleton;

public class SingletonClassTest {
	
	public static void main(String[] args) {
		
		new Thread(new MyThread("Thred1")).start();
		new Thread(new MyThread("Thred2")).start();
		new Thread(new MyThread("Thred3")).start();
		
	}

}
