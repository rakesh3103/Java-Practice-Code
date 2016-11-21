class A1{
	int i;
	
}
class B1 extends A1{
	int i;
	void setvalues(int x,  int y){
		super.i = x;
		i = y;
	}
	void show(){
		System.out.println("Super i: " + super.i);
		System.out.println("Sub i: " + i);
	}
}

public class UseSuper {

	public static void main(String args[]){
		
		B1 newB = new B1();
		newB.setvalues(10,20);
		newB.show();
	}
}
