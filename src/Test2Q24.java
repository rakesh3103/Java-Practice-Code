class recursion {

 int func (int n) {

 int result;

 result = func (n - 1);

 return result;

 }

 }
public class Test2Q24 {
	public static void main(String args[]) {

		 recursion obj = new recursion() ;

		 System.out.print(obj.func(12));

		 }

}
