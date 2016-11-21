/*class Box {

	double width;
	double height;
	double depth;
	
	void volume(){
		System.out.print("The Voume of box is: ");
		System.out.println(width * height * depth);
	}
}
*/
public class BoxDemo3 {
	public static void main(String args[]){
		
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		//mybox1.SetDim(10, 20, 15);
	    //mybox2.SetDim(3, 6, 9);
		vol = mybox1.volume();
		System.out.println("The Volume of the box 1 is: " + vol);
		vol = mybox2.volume();
		System.out.println("The Volume of the box 2 is: " + vol);
	}

}
