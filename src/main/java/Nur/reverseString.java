package Nur;

public class reverseString {

	public static void main(String[] args) {
		String str= "abcd";
		String reverse =" ";
		for(int i=str.length(); i>=0; i--) {
	reverse=reverse+str.charAt(i);	
	
		
		}
		System.out.println(reverse);
	}

}
