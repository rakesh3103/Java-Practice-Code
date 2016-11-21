
public class DemoJoin {
	public static void main(String args[]){
		NewThread1 ob1 = new NewThread1("one",200);
		NewThread1 ob2 = new NewThread1("two",400);
		NewThread1 ob3 = new NewThread1("three",600);
		System.out.println(" Thread " + ob1.t.getName() + " is alive " + ob1.t.isAlive());
		System.out.println(" Thread " + ob2.t.getName() + " is alive " + ob2.t.isAlive());
		System.out.println(" Thread " + ob3.t.getName() + " is alive " + ob3.t.isAlive());
		
		
		try{
			System.out.println("Waiting for threads to finish...");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}catch(InterruptedException e){
			System.out.println("Main Intterpution Execption");
		}
		System.out.println(" Thread " + ob1.t.getName() + " is alive " + ob1.t.isAlive());
		System.out.println(" Thread " + ob2.t.getName() + " is alive " + ob2.t.isAlive());
		System.out.println(" Thread " + ob3.t.getName() + " is alive " + ob3.t.isAlive());
		
		System.out.println("Main thread is exiting...");
		
	}

	

}
