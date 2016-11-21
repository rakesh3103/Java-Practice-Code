class Client implements Callback{
	 
	public void callback(int p){
		System.out.println("The value of p is: " + p );
	}
	
	void nonIfMethod(int q){
		System.out.println("The value of non interface function is: " + q);
	}
}
	class AnotherClient implements Callback{
		public void callback(int p){
			System.out.println("Another version of callback");
			System.out.println("P squared is : " + p*p);
		}
	}


class TestIf{
	public static void main(String args[]){
		
		Client newClient = new Client();
		newClient.callback(5);
		newClient.nonIfMethod(10);
		
		Callback c = new Client();
		c.callback(15);
		
		AnotherClient ob = new AnotherClient();
		c.callback(42);
		c = ob;
		c.callback(42);
		
	}
}
