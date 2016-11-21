class clicker implements Runnable{
	long click = 0;
	private volatile boolean running = true;
	Thread t;
	public 			clicker(int i){
		t = new Thread(this);
		t.setPriority(i);
		
	}
	
	public void run(){
		while(running){
			click++;
		}
	}
	
	public void start(){
		t.start();
	}
	public void stop(){
		running  = false;
	}
	
	
}
public class HiLoPri {
	public static void main(String args[]){
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
		
		clicker hi = new clicker(Thread.NORM_PRIORITY + 5);
		clicker lo = new clicker(Thread.NORM_PRIORITY -4);
		hi.start();
		lo.start();
		System.out.println("hi priority is : " + hi.t.getPriority());
		System.out.println("lo priority is : " + lo.t.getPriority());
		try{
			Thread.sleep(0,5);
		}catch(InterruptedException e){
			System.out.println("Main Execption");
		}
		hi.stop();
		lo.stop();
		try{
			hi.t.join();
			lo.t.join();
		}catch(InterruptedException e){
			System.out.println("Main exeception");
			
		}
		
		double total = hi.click + lo.click;
		System.out.println("hi clicker: " + hi.click);
		System.out.println("lo clicker: " + lo.click);
		System.out.println("Average of hi: "+ (hi.click/total)*100);
		System.out.println("Average of lo: "+ (lo.click/total)*100);
		
	}

}
