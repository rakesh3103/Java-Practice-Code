
public class CurrentThreadDemo {

	
	public static void main(String args[]){
		
		Thread t = Thread.currentThread();
		System.out.println("Current thread is: " + t);
		t.setName("Mythread");
		System.out.println("Now the name is: " + t.getName());
		try{
		for(int i = 5; i>0 ; i--){
			
				System.out.println(i);
				Thread.sleep(1000);
		}
			}catch(InterruptedException e){
				
				System.out.println("Thread Interrupted " + e);
				
			}
			
			
		}
	}

