package singleton;

public class MyThread implements Runnable{

	private String threadName;
	
	public MyThread(String threadName) {
		this.threadName=threadName;
	}
	
	@Override
	public void run() {
		System.out.println(this.threadName + " | " +  SingletonClass.getInstance().hashCode());
	}
}
