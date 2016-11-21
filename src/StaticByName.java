class StaticDemo{
	
	final static int a = 10;
	static int b = 20;
	static void callme(){
		System.out.println("a : " + a);
	}
}
public class StaticByName {
	
	public static void main(String args[]){
		//StaticDemo.a = 30;
		StaticDemo.callme();
		System.out.println("b : " + StaticDemo.b);
		
	}

}
