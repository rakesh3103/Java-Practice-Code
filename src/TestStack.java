import java.util.Scanner;;

class stack{
	 int stck[] = new int[10];
	private int tos = -1;
	
	
	void push(int item){
		if(tos == stck.length-1)
			
			System.out.println("The stack if full");
			
			
		else 
			
			stck[++tos] = item;
			
	}
	
	
	int pop(){
		
		
		if(tos < 0) 
			return 0;
		else return stck[tos--];
		
		
	}
	
	int getTos(){
		return tos;
	}
	
}
public class TestStack {
	
	public static void main(String args[]){
		int j;
		stack mystack = new stack();
		
	
		Scanner scan = new Scanner(System.in);
		for (j = 0; j < 10; j++){
	     System.out.println("Enter a value : ");
	     
	     //i = scan.nextInt();
	     mystack.push(scan.nextInt());
	     
	     
		}
		scan.close();
		
		for (j = 0; j < 20; j++){
			
			int t = mystack.getTos();
			if(t < 0) System.out.println("The Stack  is Empty");
			else System.out.println("The top value in stack is : " + mystack.pop());
		}
		
	}

}
