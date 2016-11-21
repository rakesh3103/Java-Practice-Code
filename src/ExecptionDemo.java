class MyException extends Exception{
	private int detail;
	MyException(int a){
		detail = a;
	}
	
	public String toString(){
		return "MyException [" + detail +"]";
	}
	
}
public class ExecptionDemo {
	
	static void Compute(int a) throws MyException{
		System.out.println(" called: " + a);
		if(a>10) throw new MyException(a);
		else System.out.println("Normal exit");
		
		
	}
	
	public static void main(String args[]){
		try{
			Compute(1);
			Compute(20);
		}catch(MyException e){
			System.out.println("Exception caught " + e);
		}
	}
	
	

}
