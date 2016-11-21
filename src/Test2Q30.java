class Thread1 extends Thread{
	public void run(){
		for(int i = 0; i<1000; i++){
			System.out.println("Thread1.." +i);
		}
	}
}

class Thread2 implements Runnable{
	Thread temp;
	public	Thread2(Thread temp){
		this.temp = temp;
	}
	@Override
	public void run(){
		for (int i = 1000; i>=0; i--){
			System.out.println("Thread2.." + i);
			if(i == 800){
				try{
					temp.join();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	}
}
public class Test2Q30 {
	public static void main(String[] args) {
		Thread1 t = new Thread1();
		Thread2 u = new Thread2(t);
		Thread z = new Thread(u);
		t.start();
		z.start();
	}
}
