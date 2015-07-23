package subclass;
import mainclass.*;

public class Child {
	public Child(){
		System.out.println(new Mother().x);
	}
	
	public static void main(String[] args){
		new Child();
	}
}
