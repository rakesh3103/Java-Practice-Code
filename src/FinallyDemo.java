
public class FinallyDemo {
	
	static void procA(){
		
	try{
		System.out.println("Inside ProcA");
		throw new RuntimeException("Demo");
		
	}finally {
		System.out.println("ProcA finally");
	}
}
	static void procB(){
		try{
			System.out.println("Inside procB");
			return;
		}finally {
			System.out.println("ProcB finally");
		}
	}
	static void procC(){
		try{
			System.out.println("Inside procC");
			
		}finally{
			System.out.println("ProcC finally");
		}
		
			
		
	}
	
	public static void main(String args[]){
		try{
			procA();
		} catch(RuntimeException e){
			System.out.println("Execption caught");
			
		}
		procB();
		procC();
	}
	
}

