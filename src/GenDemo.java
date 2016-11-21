
class Gen<T>{
	T ob;
	Gen(T o){
		ob = o;
	}
	T getob(){
		return ob;
		
	}
	
	void showtype(){
		System.out.println("The type of T is: " + ob.getClass().getName());
	}
}

public class GenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gen<Integer> iob;
		iob = new Gen<Integer>(88);
		iob.showtype();
		System.out.println("Value: " + iob.getob());
		Gen<String> Stringob = new Gen<String>("Generics!");
		Stringob.showtype();
		System.out.println("Value: " + Stringob.getob());
		

	}

}
