class Outer{
	int outer_x = 10;
	void test(){
		Inner inner = new Inner();
		inner.display();
		
	}
	class Inner{
		void display(){
			System.out.println("The value of outer_x is: " + outer_x);
		}
		
		
	}
}


public class InnerClassDemo {
	
	public static void main(String args[]){
		
	 
		Outer outer = new Outer();
		outer.test();
	}

}
