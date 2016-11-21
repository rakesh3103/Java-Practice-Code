
public class Average {

	public static void main(String args[]){
		//double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
		double nums[] = new double[5];
		nums[0] = 10.1;
		nums[1] = 11.2;
		nums[2] = 12.3;
		nums[3] = 13.4;
		nums[4] = 14.5;
		double average = 0;
		int i;
		for(i=0; i<5; i++){
			
			average = average + nums[i];
			
		}
		
		System.out.println(" The average is : " + average/5);
	}
}
