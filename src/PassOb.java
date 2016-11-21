

class Test{
	int a;
	int b;
	
	Test(int i, int j){
		a = i;
		b = j;
	}
	
	boolean equals(Test o){
        if (o.a == a && o.b == b) return true;
        else return false;
	}
}
public class PassOb {
	
	public static void main(String args[]){
		
	

	Test mytest1 = new Test(100,22);
	Test mytest2 = new Test(100,22);
	Test mytest3 = new Test(5,4);
	
	System.out.println("mytest1 = mytest2 : " + mytest1.equals(mytest2));
	System.out.println("mytest1 = mytest3 : " + mytest1.equals(mytest3));
}
}