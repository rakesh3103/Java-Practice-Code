
public class Exc1 {
	public static void main (String args[]){

		int a, d;
		
		try{
			d =0;
			a = 42/d;
			System.out.println("This will not be printed");
		}	catch (ArithmeticException e){
			
			System.out.println("Division by Zero");
			
			
		}
		System.out.println("After Catch");
		
	
	

		
	

}
}
