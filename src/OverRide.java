class A2{
	int i;
	int j;
	A2(int i, int j){
		this.i = i;
		this.j = j;
	}
	void show(){
		System.out.println("i: " + i + " j: " + j);
		
	}
}

class B2 extends A2{
	int k;
	B2(int i, int j, int k){
		super(i, j);
		this.k = k;
	}
		void show(){
			super.show();
			System.out.println("K: " + k);
		
		
	}
}
public class OverRide {
	public static void main(String args[]){
		B2 newB = new B2(10,20,30);
		newB.show();
		
	}
	
	
	
	

}
