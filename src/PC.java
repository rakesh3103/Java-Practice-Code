class Q{
	int n;
	boolean valueSet = false;
	
	synchronized int  get(){
		while(!valueSet){
			try{
			wait();
			}catch(InterruptedException e){
				System.out.println("Exception");
			}
		
		
		}
		
		System.out.println("Got: " + n);
		valueSet = false;
		notify();
		return n;
	}
	
	synchronized void put(int n){
		while(valueSet){
			try{
				wait();
				
			}catch(InterruptedException e){
				System.out.println("Exception");
			}
		}
		this.n = n;
		System.out.println("Put: " + n);
		valueSet = true;
		notify();
	}
	
}

class Producer implements Runnable{
	Q q;
	Producer(Q q){
		this.q = q;
		new Thread(this, "Producer").start();
	}
	public void run(){
		int i = 0;
		while(i<=5){
			q.put(i++);
		}
	}
}
class Consumer implements Runnable{
	Q q;
	
	Consumer(Q q){
		this.q = q;
		new Thread(this, "Consumer").start();
		
	}
	public void run(){
		int i = 0;
		while(i<=5){
		q.get();
		i++;
		}
	}
}
public class PC {
	public static void main(String args[]){
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		
		
		
	}

}
