package Nur;

public class CountCharacterOccurance {
	//we have to find out how many times a occured 

public static void main(String[] args) {
//		
//		String s = "Java Programing Java oops";
//		int totalCount = s.length() ; //will give you total length of the string 
//		int totalCountAfterA= s.replace("a", "").length();//we will replace "a" with empty characters, total length after removing a 
//int count=totalCount- totalCountAfterA;
//System.out.println("Number of occurance of a is : " + count);
	

String a = "I want to get the job ";
 int totalCount= a.length();
 int countAfterA= a.replace("t", "").length();
 int count = totalCount- countAfterA;
 
 System.out.println("Number of accurance t : " + count);









	
}	
}
