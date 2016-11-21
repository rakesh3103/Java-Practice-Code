
class A{
	int i;
	/*private*/ int j;
	void setij(int x, int y){
		i = x;
		j = y;
	}
}
	
	class B extends A{
		int total;
		void sum(){
			total = i+j;
		}
	}


public class Access {
	public static void main(String args[]){
		
		B Subob = new B();
		Subob.setij(5, 10);
		Subob.sum();
		System.out.println("total: " + Subob.total);
	}

}
