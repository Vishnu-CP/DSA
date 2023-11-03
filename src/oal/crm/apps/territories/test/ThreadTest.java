package oal.crm.apps.territories.test;

public class ThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Start");
		
		
		System.out.println("Main Mid");
		
		// Lambda Runnable
		Runnable task2 = () -> { 
			System.out.println("Task #2 is running"); 
			try {
				Thread.sleep(500);
				throw new RuntimeException();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("Task #2 is running end"); };
		 
		// start the thread
		new Thread(task2).start();
		Thread.sleep(2000);
		
		
		System.out.println("Main end");
		
	}

}
