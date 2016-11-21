class OverLoadDemo {
	void test(){
		System.out.println("This is empty!");
		
	}
	/*
	void test(int i){
		System.out.println("The value of i : " + i);
	}
	*/
	
	void test(int i, int j){
		System.out.println("The values of i is : " + i + "The value of j is : " + j);
	}
	
	double test(double i){
		
		System.out.println("The double value of i is : " + i);
		return i*i;
	}
	}
public class Overload {
	
	public static void main(String args[]){
		
		OverLoadDemo myload = new OverLoadDemo();
		
		myload.test();
		myload.test(5);
		myload.test(3, 6);
		System.out.println("The double value of i is : " + myload.test(12.5));
		myload.test(153.0);
	}

}
