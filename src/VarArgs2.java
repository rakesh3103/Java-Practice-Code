
public class VarArgs2 {
	
	static void vaTest(String msg, int ...v){
		System.out.print(msg + "The length is : " + v.length +" The Contents are : ");
		for (int x:v){
			System.out.print(x +" ");
		}
		System.out.println();
	}

	public static void main(String args[]){
		vaTest("First: ", 1);
		vaTest("Second: ", 2,3,4,5);
		vaTest("Third: ");
	}
}
