
public class BoxOverloading {
	
	public static void main(String args[]){
		
		Box mybox1 = new Box(10,20,30);
		Box mybox2 = new Box();
		Box mybox3 = new Box(5);
		Box myclone = new Box(mybox1);
		System.out.println("The volume of box 1 is : " + mybox1.volume());
		System.out.println("The volume of box 2 is : " + mybox2.volume());
		System.out.println("The volume of box 3 is : " + mybox3.volume());
		System.out.println("The volume of box clone is : " + myclone.volume());
	}

}
