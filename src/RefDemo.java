
public class RefDemo {
	
	public static void main(String args[]){
		BoxWeight weightBox = new BoxWeight(10,20,30,40 );
		Box plainBox = new Box();
		System.out.println("Volume of WeightBox is: " + weightBox.volume());
		System.out.println("The weight is: " + weightBox.weight);
		plainBox = weightBox;
		System.out.println("Volume os plain box is : " + plainBox.volume());
		//System.out.println("The weight is: " + plainBox.weight);
		
	}

}
