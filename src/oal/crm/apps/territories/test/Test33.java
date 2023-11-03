package oal.crm.apps.territories.test;

public class Test33 {
	
	static int  solve(int N) {
		System.out.println();
		
		int number= 1;
		
		for(int i = 1; i<=N ; i++){
		  number = number*2;

		}
		System.out.println("2^"+N+"="+number);
		
	return getSum(number);
	
	}
	
	static int getSum(int number) {
		
		
		if(number < 10) {
			return number;
		}
			
		int sum= 0;
			while(number >1) {
				
				sum = sum + number %10;
				number = number / 10;
			}
			
		sum=sum+number;
		
		if(sum >= 10) {
			return getSum(sum);
		}
		return sum;
		
			

		
	}
	
	public static void main(String[] args) {
		
//		System.out.println(solve(1));
//		System.out.println(solve(2));
//		System.out.println(solve(3));
//		System.out.println(solve(4));
//		System.out.println(solve(5));
//		System.out.println(solve(6));
//		System.out.println(solve(7));
//		System.out.println(solve(8));
//		System.out.println(solve(9));
//		System.out.println(solve(10));
//		System.out.println(solve(11));
		
	
	}

}
