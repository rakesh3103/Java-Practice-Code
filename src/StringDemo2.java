
public class StringDemo2 {

	public static void main(String args[]){
		String strob1 = "First String";
		String strob2 = "Second String";
		String strob3 = strob1;
		
		System.out.println("The first string has " + strob1.length() + " characters");
		for(int i = 0; i < strob1.length(); i++){
			if(strob1.charAt(i) != ' ')System.out.println("The " + (i+1) +"th Character is " + strob1.charAt(i));
			else System.out.println("It's a space!");
		}
		System.out.println("strob1 == strob3: " + strob1.equals(strob3));
		System.out.println("strob1 == strob2: " + strob1.equals(strob2));
		
	}
}
