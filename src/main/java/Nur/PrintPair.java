package Nur;

public class PrintPair {

	public static void main(String[] args) {


int[] num= {1, 1, 4 ,5, 3 ,4};
		

//10. Write a Java program to print number of pairs of a particular number.
//Input: {1,1,4,5,3,4}
//Output: 2 (1 pair of 1 and 1 pair of 4).
	int pair=0;
	for (int i=0; i<num.length; i++) {
	 for (int k =i+1; i<num.length ;i++) {	
	 if (num[i]==num[k])	{
		 pair++;
		 
	 }
		 
	 }
		
		
	}
	System.out.println(pair);	
		
		
		
	}
	
	}


