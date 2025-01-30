package observer;

import java.util.ArrayList;
import java.util.List;

public class TaskDetail implements Task{

	private String taskName;
	private String status;
	private List<TaskObserver> observerList;

	public TaskDetail(String taskName) {
		observerList=new ArrayList<>();
		this.taskName=taskName;
	}
	
	@Override
	public void registerObserver(TaskObserver observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(TaskObserver observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(TaskObserver observer : observerList) {
			observer.update(taskName, status);
		}
	}
	
	@Override
	public void updateStatus(String status) {
		this.status = status;
		notifyObservers();
	}

	@Override
	public String toString() {
		return "Task [taskName=" + taskName + ", status=" + status + "]";
	}

	
}
