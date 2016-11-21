class TwoGen<T,V>{
	 T ob1;
	private V  ob2;
	TwoGen(T o, V p){
		ob1 = o;
		ob2 = p;
	}
	void ShowType(){
		System.out.println("The type of T is " + ob1.getClass().getName());
		System.out.println("The type of V is " + ob2.getClass().getName());
		
	}
	
	T getOb1(){
		return ob1;
	}
	
	V getOb2(){
		return ob2;
	}
	
}
public class SimpleGen {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		TwoGen<Integer, String> newgen = new TwoGen<Integer, String>(88, "Generics!");
		newgen.ShowType();
		int v = newgen.ob1;
		System.out.println("Value: " + v);
		System.out.println("Value: "  + newgen.getOb2());
	}

}
