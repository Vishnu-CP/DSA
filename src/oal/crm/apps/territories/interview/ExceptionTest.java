package oal.crm.apps.territories.interview;

public class ExceptionTest {

	
	public static void main(String[] args) 
	{
		
		try {
			System.out.println("start try");
			
			new ExceptionTest();
			
			int[] arr = new int[3];
			
			int val = arr[3];
			
			int a =	2/0;
			
			System.out.println("END -TRY");
			
		
		}
		catch(ArithmeticException ex) {
			System.out.println("ArithmeticException Caught");
		}
		catch(RuntimeException ex) {
			System.out.println("RuntimeException Caught");
		}
		
		catch(Exception ex) {
			System.out.println("Exception Caught");
		}
	}

}
