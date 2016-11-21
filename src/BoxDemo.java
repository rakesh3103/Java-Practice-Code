 class Box {

	double width;
	double height;
	double depth;
	
	
	Box(Box ob){
		width = ob.width * 2;
		height = ob.height * 2;
		depth = ob.depth * 2;
	}
	
	
	Box(double w,double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
	Box(){
		width = -1;
		height = -1;
		depth = -1;
	}
	
	Box(double len){
		width = height = depth = len;
	}
	
	double volume(){
		return width * height * depth;	}
	
}
 

class BoxDemo{
public static void main(String args[]){

	Box mybox = new Box();
	double vol;
	mybox.width = 10;
	
	mybox.height = 20;
	mybox.depth = 15;
	vol = mybox.width * mybox.height * mybox.depth;
	System.out.println("The Volume of the box is: " + vol);
	Box mybox2 = new Box();
	mybox2.width = 	3;
	mybox2.height = 6;
	mybox2.depth = 9;
	vol = mybox2.width * mybox2.height * mybox2.depth;
	
	
	
	System.out.println(" The Volume of the box2 is: " + vol);
	
	
}
	
}
