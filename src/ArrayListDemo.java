
//import java.lang.*;
import java.util.ArrayList;
//import java.lang.Object;

public class ArrayListDemo {

	public static void main(String args[]) {

		// ArrayList <String> al = new ArrayList<String>();
		ArrayList al = new ArrayList();

		long t = 0;
		long i = 0;
		String a = "i";
		long time1 = System.nanoTime();
		for (t = 0; t <= 10000; t++) {

			al.add(a);
			//al.add(i);

			//i++;
		}

		System.out.println(i);
		long time2 = System.nanoTime();
		long forTime = time2 - time1;

		System.out.println("The array is done and the time taken is : " + (forTime / 1000000) + " millisecs");
		long t1 = System.nanoTime();
		al.add(1, "A2");
		// al.remove(1);
		long t2 = System.nanoTime();
		long time = t2 - t1;

		System.out.println("I am done and the size is : " + al.size() + " and the time taken to add/remove record is : "
				+ (time / 1000000) + " millisecs");
		// System.out.println(al);
	}
}