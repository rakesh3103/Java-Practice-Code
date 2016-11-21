class Callme {
	 void callme(String msg){
	System.out.print("[ " + msg );
	try{
		Thread.sleep(1000);
		
	}catch(InterruptedException e){
		System.out.println("Thread Interrupted");
	}
	
	System.out.print(" ]");
	}
	
}

class Caller implements Runnable{
	Thread t;
	String msg;
	Callme target;
	public Caller(Callme targ, String s){
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
		public void run() 	{
			synchronized(target){
			
			target.callme(msg);
			}
		
		
		
	}

}




public class Sync {
	public static void main(String args[]){
		Callme target =  new Callme();
		Caller ob1 = new Caller(target, "Hello");
		Caller ob2 = new Caller(target, "Synchronized");
		Caller ob3 = new Caller(target, "World");
		try{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}catch(InterruptedException e){
			System.out.println("Main Execption");
		}
	}

}
