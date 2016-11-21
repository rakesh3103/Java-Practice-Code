abstract class A4{
	abstract void callme();
	void callmetoo(){
		System.out.println("I am inside A");
	}
	
	
}

class B4 extends A4{
	void callme(){
		System.out.println("I am inside B");
	}
}
public class AbstractDemo {
	
	public static void main(String args[]){
		//Object newob = new Object();
		B4 newB = new B4();
		newB.callme();
		newB.callmetoo();
	
		A4 r;
		r =newB;
		r.callme();
		r.callmetoo(); 
	}

}
