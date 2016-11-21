
public class BoolTest {

	public static void main(String args[]){
		boolean b;
		b= false;
		System.out.println("The Value of b is : " + b);
		b = true;
		System.out.println("The value of b now is : " + b);
		if(b) System.out.println("This is executed");
		b = false;
		if(b) System.out.println("This is not executed");
		System.out.println("10>9 : "+  (10>9));
		System.out.println("10<9 : "+  (10<9));
		System.out.println("\"This is in quotes\"");
	}
}
