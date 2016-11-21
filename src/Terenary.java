import java.util.Scanner;
public class Terenary {

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of i : ");
		
		int i = scanner.nextInt();
		//int i = 10;
		int k;
		k = i < 0? k = -i: i;
		System.out.println(" The value of i is : "+ i + " The value of k is : " + k);
		scanner.close();
		//i = -10;
		
		//k = i < 0? k = -i: i;
		//System.out.println(" The value of i is : "+ i + " The value of k is : " + k);
		
	}
}
