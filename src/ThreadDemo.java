

class NewThread implements Runnable{
	Thread t;
	NewThread(){
		t = new Thread(this, "Demo");
		System.out.println("Child Thread: " + t.getName());
		t.start();
	}
	public void run(){
		try{
			for (int i = 5; i > 0; i--)
			{
				System.out.println("Child thread: " + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e){
			System.out.println("Child Thread Interrupted");
		}
		System.out.println("Exiting child thread...");
	}
	
}
public class ThreadDemo {
	public static void main(String args[]){
		new NewThread();
		System.out.println("Main Thread: " + Thread.currentThread().getName());
	
		
		try{
			for (int i = 5; i>0; i--){
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e){
			System.out.println("Main Thread interrupted");
			
		}
		
		System.out.println("Main Thread Exiting... ");
	}

}
