class NewThread2 implements Runnable{
	String name;
	boolean suspendFlag;
	Thread t;
	NewThread2(String Threadname){
		name = Threadname;
		t = new Thread(this,name);
		System.out.println("Thread: " + t);
		suspendFlag = false;
		t.start();
	}
	public void run(){
		try{
			for (int i = 15; i>=0 ; i--){
				System.out.println(name + i);
				Thread.sleep(200);
				synchronized(this){
					while(suspendFlag){
						wait();
					
					}
				}
			}
		}catch(InterruptedException e){
			System.out.println("Exception");
		}
		System.out.println("Exiting....");
	}
	 void mySuspend(){
		suspendFlag = true;

	
}
	synchronized void myResume(){
		suspendFlag = false;
		notify();
	}

	
}
public class SuspendResume {
	public static void main(String args[]){
	NewThread2 ob1 = new NewThread2("One");
	NewThread2 ob2 = new NewThread2("Two");
	try{
		Thread.sleep(1000);
		ob1.mySuspend();
		System.out.println(ob1.t.getName() + " is suspended...");
		Thread.sleep(1000);
		ob1.myResume();
		System.out.println(ob1.t.getName() + " is Resuming...");
		Thread.sleep(1000);
		ob2.mySuspend();
		System.out.println(ob2.t.getName() + " is suspended...");
		Thread.sleep(1000);
		ob2.myResume();
		System.out.println(ob2.t.getName() + " is Resuming...");
		
	}catch(InterruptedException e){
		System.out.println("Exception");
	}
	try{
		ob1.t.join();
		ob2.t.join();
	}catch(InterruptedException e){
		System.out.println("exception");
	}
System.out.println("Main exiting...");
}
}