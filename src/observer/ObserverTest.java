package observer;

public class ObserverTest {

	public static void main(String[] args) {

		Task taskDetail1 = new TaskDetail("Task1");
		Task taskDetail2 = new TaskDetail("Task2");
		
		for (int counter = 1; counter <= 5; counter++) {
			new TaskObserverImpl("Observer" + counter, taskDetail1);
		}
		
		for (int counter = 11; counter <= 12; counter++) {
			new TaskObserverImpl("Observer" + counter, taskDetail2);
		}
		
		taskDetail1.updateStatus("Created");
		taskDetail1.updateStatus("Inprogress");
		taskDetail2.updateStatus("Created");
		taskDetail1.updateStatus("Completed");
		taskDetail2.updateStatus("Terminated");

	}
}
