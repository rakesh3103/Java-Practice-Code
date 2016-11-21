class MyClass<X>{
	<T> MyClass(T t){
		
	}
}
public class CoreJavaTest {
	
	static boolean x;

	public static void main(String args[]){
		
		
		System.out.println(x);
		try{
			int x = 0;
			int y = 5/x;
			//throw new NullPointerException() ;
		}catch(Exception e){
		System.out.println("Exception");	
		}
		//catch(Exception ae){
			//System.out.println("Arthimetic Exception");
		//}
		System.out.println("Finished");
	}
}
