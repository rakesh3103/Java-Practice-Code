class A5{
	public interface NestedIf{
		boolean isNotNegative(int p);
	}
}

class B5 implements A5.NestedIf{
	public boolean isNotNegative(int p){
		
		return p < 0 ? false : true;
	}
}
public class NetedIfDemo {
	
	public static void main(String args[]){
		B5 nif = new B5();
		if(nif.isNotNegative(10))
			System.out.println("The value is postitive");
		else
			System.out.println("It's negative");
		if(nif.isNotNegative(-5))
			System.out.println("The value is postitive");
		else
			System.out.println("It's negative");
			
		
	}

}
