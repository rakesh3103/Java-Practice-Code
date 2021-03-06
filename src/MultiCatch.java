
public class MultiCatch {
	
	public static void main(String args[]){
		try{
		int a = args.length;
		System.out.println("a: " + a);
		int b = 42/a;
		
		int c[] = {1};
		c[42] = 50;
		
		} catch(ArithmeticException e){
			System.out.println("Division by zero: " + e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array out of bounds: " + e);
			
		}
		System.out.println("After try/Catch");
	}

}
