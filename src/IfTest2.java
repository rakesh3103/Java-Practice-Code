class DynStack implements IntStack{
	
	private int stck[];
	private int tos;
	
	DynStack(int i){
		stck = new int[i];
		tos = -1;
		
	}
	
	public void push(int j){
		
		if(tos == stck.length-1){
			int temp[] = new int[stck.length*2];
			for(int x =0 ; x <= stck.length-1; x++) temp[x] = stck[x];
			stck = temp;
			stck[++tos] = j;
			
		}
		else stck[++tos] = j;
	}
	
	int returntos(){
		return tos;
	}
	public int pop(){
		if(tos <= -1){
			System.out.println("The stack is empty");
			return 0;
		}
		else return stck[tos--];
	}
	
}

public class IfTest2 {
	public static void main(String args[]){
		
	DynStack mystack1 = new DynStack(5);
	DynStack mystack2 = new DynStack(10);
	for(int k = 0; k<= 4 ; k++) mystack1.push(k);
		
	
	for (int k = 0 ; k <=20; k++) mystack2.push(k);
	int y = mystack1.returntos();
	int z = mystack2.returntos();
	System.out.println("Stack1 is " + y + " long");
	for(int k = 0; k<=4 ; k++) System.out.println(mystack1.pop());
	System.out.println("Stack2 is " + z + " long");
	for (int k= 0; k<= 20; k++)System.out.println(mystack2.pop()); 
	
	
	}
	

}
