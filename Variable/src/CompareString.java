
public class CompareString {
	
	public static void main(String args[]){
		String s1 = "Hello";
		String s2 = "Hello";
		
		if (s1 == s2){
			System.out.println("Match");
		}else{
			System.out.println("No match");
		}
		
		equalString(s1, s2);
	}

	private static void equalString(String s1, String s2) {
		if(s1.equals(s2)){
			System.out.println("Match");
		}else{
			System.out.println("No match");
		}
	}
}
