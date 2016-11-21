class A3{
	void callme(){
		System.out.println("Inside A");
	}
	
}
class B3 extends A3{
	void callme(){
		System.out.println("Inside B");
		
	}
}
class C3 extends B3{
	void callme(){
		System.out.println("Inside C");
	}
}
public class Dispatch {
	
	public static void main(String args[]){
		A3 newA = new A3();
		B3 newB = new B3();
		C3 newC = new C3();
		A3 r;
	    r = newA;
	    r.callme();
	    r = newB;
	    r.callme();
	    r = newC;
	    r.callme();
	}

}
