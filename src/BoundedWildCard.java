class TwoD{
	int x,y;
	TwoD(int a, int b){
		x= a;
		y = b;
	}
	
}

class ThreeD extends TwoD{
	int z;
	ThreeD(int a, int b, int c){
		super(a,b);
		z = c;
	}
	
}

class FourD extends ThreeD{
	int t;
	FourD(int a, int b, int c, int d){
		super(a,b,c);
		t = d;
	}
}
class Coords<T extends TwoD>{
	T[] coords;
	Coords(T[] o){
		coords = o;
	}
}
public class BoundedWildCard {
	
	static void showXY(Coords<?> c){
		System.out.println("X Y coordinates are: ");
		for(int i = 0; i<c.coords.length; i++){
			System.out.println(c.coords[i].x + ", " + c.coords[i].y);
			
		}
		
	}
	static void showXYZ(Coords<? extends ThreeD> c){
		System.out.println("X Y Z coordinates are: ");
		for(int i = 0; i<c.coords.length; i++){
			System.out.println(c.coords[i].x + ", " + c.coords[i].y + " , " + c.coords[i].z);
			
		}
	}
	static void showAll(Coords<? extends FourD> c){
		System.out.println("X Y Z T coordinates are: ");
		for(int i = 0; i<c.coords.length; i++){
			System.out.println(c.coords[i].x + ", " + c.coords[i].y + " ," + c.coords[i].z + " ," + c.coords[i].t);
			
			
		}
	}
	   
	    public static void main(String args[]){
	    	TwoD td[] = {new TwoD(1,2)};
	    	ThreeD thd[] ={ new ThreeD(1,2,3)};
	    	FourD fd[] = {new FourD(1,2,3,4)};
	    	Coords<TwoD> tdlocs = new Coords<TwoD>(td);
	    	Coords<ThreeD>thdlocks = new Coords<ThreeD>(thd);
	    	Coords<FourD>fdlocks = new Coords<FourD>(fd);
	    	showXY(tdlocs);
	    	showXYZ(thdlocks);
	    	showAll(fdlocks);
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	    	
	    	
	   
	
	
	

}
