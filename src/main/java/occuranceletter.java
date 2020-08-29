
public class occuranceletter {
	public static void main(String[] args) {
		
		System.out.println(verifyLength("Privet Olesea" , "e"));
		
		
	}

	public static int  verifyLength (String name, String rec) {
		int length= name.length();
		int replace=name.replace(rec, "").length();
		
		int total=length-replace;
		return total;
		
	}
	
	
	
}
