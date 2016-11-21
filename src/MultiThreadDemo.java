
class NewThread1 implements Runnable{
	Thread t;
	String threadname;
	int stoptime;
	NewThread1(String s, int time){
		 threadname = s;
		 stoptime = time;
		t = new Thread(this, threadname);
		System.out.println("Thread is : " + threadname);
		
		t.start();
		
	}
	
	public void run(){
		try{
			for(int i = 5 ; i>0; i--){
				System.out.println("Thread " + threadname + " : " + i);

				Thread.sleep(stoptime);
			}
		}catch(InterruptedException e){
			System.out.println("InterruptedException");
			
		}
		
		System.out.println("Thread " + threadname + " exiting...");
	}
	
}

public class MultiThreadDemo {
	
	public static void main(String args[]){
		
		new NewThread1("One", 200);
		new NewThread1("Two", 400);
		new NewThread1("Three", 600);
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			System.out.println("Main thread InterruptedException");
			
		}
		System.out.println("Main thread exiting...");
		
	}
	
	

}
