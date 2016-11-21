class Stats<T extends Number>{
	
	T[] nums;
	Stats(T[] o){
		nums = o;
	}
	
	double getAverage(){
		double sum = 0;
		for (int i = 0; i < nums.length ; i++){
			
			sum = sum + nums[i].doubleValue();
			
		}
		return (sum/nums.length);
	}
	boolean sameAve(Stats<?> ob){
		if(getAverage() == ob.getAverage())
			return true;
		return false;
	}
	
}
public class BoundsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Integer inos[] = {1,2,3,4,5};
      Double[] dnos = {1.0, 2.0, 3.0, 4.0, 5.0};
      Stats<Integer> integeravg = new Stats<Integer>(inos);
      System.out.println("Average: " + integeravg.getAverage());
      Stats<Double> doubleavg = new Stats<Double>(dnos);
      
      System.out.println("Average: " + doubleavg.getAverage());
      if(integeravg.sameAve(doubleavg))
    	  System.out.println("The averages are same");
      else
    	  System.out.println("The averages are NOT same");
	}

}
