package Nur;

public class OddEven {

	public static void main(String[] args) {
	int []num= {1,2,3,4,5};
	int count_even=0;
	int count_odd=0;
			
for (int i= 0; i<num.length; i++) {
	
	if (num[i]%2==0) {
		count_even+=num[i];
		
	}
	else {
		count_odd += num[i];
	}
}
System.out.println(count_even);
System.out.println(count_odd);
}

}
