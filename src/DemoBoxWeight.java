class BoxWeight extends Box{
	double weight;
	BoxWeight(double i, double j, double k, double l){
		width = i;
		height = j;
		depth = k;
		weight = l;
	}
	
}
public class DemoBoxWeight {
	
	public static void main(String args[]){
		BoxWeight myboxweight = new BoxWeight(10,20,30,40);
		double volume = myboxweight.volume();
		System.out.println("Volume: " + volume);
		System.out.println("Weight: " + myboxweight.weight);
	}

}
