class Test2{
	int a;
	public int b;
	private int c;
	void SetC(int i){
		c = i;
	}
	
	int getC(){
		return c;
	}
}
public class AccessTest2 {
	
	public static void main(String args[]){
		
		Test2 ob = new Test2();
		ob.a = 10;
		ob.b = 20;
		//ob.c = 30;
		ob.SetC(30);
		
		System.out.println("a: " + ob.a+ " b: " + ob.b + " c: " + ob.getC());
		
	}

}
