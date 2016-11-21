
class Test1{
	int a;
	Test1(int i){
		a = i;
		
	}
	
	Test1 incrten(){
		Test1 temp;
		temp = new Test1(a+10);
		return temp;
	}
}
public class RetOb {
	public static void main(String args[]){
		
	

	Test1 ob1 = new Test1(2);
	Test1 ob2;
    ob2 = ob1.incrten();
    System.out.println("Ob1 : " + ob1.a + "ob2 : " + ob2.a);
    
    System.out.println("Ob2 after another incremenrt is : " + ob2.incrten().a);
    
	}
}
