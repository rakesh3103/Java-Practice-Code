

class exam{
	int i = 9;
	
		int getSqre(){
			try{
				System.out.println("Inside try");
			return i*i;
			
			
			
		}finally{
			System.out.println("Inside Finally");
		}
}
}
public class Test2Q4 {
public static void main(String[] args) {
	
	exam ex = new exam();
	
	int j = ex.getSqre();
	System.out.println(j);
}
}
