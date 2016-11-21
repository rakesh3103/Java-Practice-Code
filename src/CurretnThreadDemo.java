
public class CurretnThreadDemo {
public static void main(String[] args) {
	Thread t = Thread.currentThread();
	System.out.println("Current thread: " +t);
	long time1, time2, time;
	try{
	for(int i= 0 ; i < 5; i++){
		System.out.println(i);
		time1 = System.currentTimeMillis();
		Thread.sleep(1000);
		time2 = System.currentTimeMillis();
		time = time2-time1;
		System.out.println("Time: " + time);
	}
	}catch(InterruptedException e){
		System.out.println("Exception");
	}
}
}
