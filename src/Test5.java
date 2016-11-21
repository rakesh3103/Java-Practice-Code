class Bar2{}
public class Test5 {
  Bar2 doBar(){
	  Bar2 b = new Bar2();
	  
	  return b;
  }
  
  public static void main(String args[]){
	  Test5 t = new Test5();
	  Bar2 newBar = t.doBar();
	  
	  if (t.doBar() == null){
		  System.out.println("Null");
	  }
	  System.out.println("new Bar");
	  newBar = new Bar2();
      System.out.println("Finishing");
  }
}
