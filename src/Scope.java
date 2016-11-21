
public class Scope {

	public static void main(String args[]){
		int x = 10;
		
		if (x == 10){
			int y=20;
			System.out.println("The value of X is :"+x +"and the value of Y is : " + y);
			y--;
		}
		int y=100;
		System.out.println("The value of X is :"+x +"and the value of Y is : " + y);
	}
}
