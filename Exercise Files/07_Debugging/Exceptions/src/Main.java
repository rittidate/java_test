
public class Main {

	public static void main(String[] args) {
		try{
			String[] strings = {"Welcome!"};
			System.out.println(strings[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("There was an error");
		}
		
		System.out.println("The application is still running!");
		
	}
		
		

}
