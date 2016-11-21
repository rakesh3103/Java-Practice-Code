class Figure{
	double dim1, dim2;
	Figure(double i, double j){
		dim1 = i;
		dim2 = j;
	}
	double Area(){
		System.out.println("The area od Figure is not found");
		return 0;
	}
}
class Rectangle extends Figure{
	Rectangle(double i, double j){
		super(i,j);
	}
	double Area(){
		System.out.println("The area of rectangle is");
		return dim1*dim2;
	}
	
}
class Triangle extends Figure{
	Triangle(double i, double j){
		super(i,j);
	}
	double Area(){
		System.out.println("The area of Triangle is");
		return (dim1*dim2)/2;
	}
}
public class FigureAreas {
	public static void main(String args[]){
		Figure f = new Figure(10,10);
		Rectangle r = new Rectangle(20,10);
		Triangle t = new Triangle(20,10);
		Figure figref;
		figref = r;
		System.out.println("Area is: " + figref.Area());
		figref = t;
		System.out.println("Area is: " + figref.Area());
		figref = f;
		System.out.println("Area is: " + figref.Area());
		
		
	}

}
