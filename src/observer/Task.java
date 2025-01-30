package observer;

public interface Task {
	
	public void registerObserver(TaskObserver taskObserver);
	public void removeObserver(TaskObserver TaskObserver);
	public void notifyObservers();
	public void updateStatus(String status);
}
