package observer;

public class TaskObserverImpl implements TaskObserver{

	private String observerName;
	private String taskName;
	private String status;
	
	public TaskObserverImpl(String observerName, Task task) {
		this.observerName = observerName;
		task.registerObserver(this);
	}
	
	@Override
	public void update(String taskName, String status) {
		this.taskName=taskName;
		this.status=status;
		showTaskDetails();
	}
	
	public void showTaskDetails() {
		System.out.println("Observer Name :: " + this.observerName + " | Task Name :: " + this.taskName + " | Status :: " + this.status);
	}
}
