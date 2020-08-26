package Nur;

public class Fibonacci {
//0 1 1 2 3 5 8 13 
	public static void main(String[] args) {
//	int num = 10 ;
//	int n1=0;
//	int n2 = 1;
//	
//	System.out.print(n1 + " " + n2);
//	
//	for (int i=2; i<num; i++) {
//		
//	 int sum = n1+n2 ;
//			n1= n2;
//			n2=sum ;
//			System.out.print(" "+ sum + " ");		
//	}
fibonacci(10);

	}
	public static void fibonacci(int num) {
		int n1=0;
		int n2 = 1;
		int sum= 0;
		
		//System.out.print(n1 + " " + n2);
		
		for (int i=2; i<num; i++) {
			
		  sum = n1+n2 ;
				n1= n2;
				n2=sum ;
				
				System.out.print(" "+ sum + " ");		
		}
		
		
	}
	

}
