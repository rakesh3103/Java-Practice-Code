
public class Type {
	public static void main(String[] args) {
		byte b;
		int i=257;
		double d=323.142;
		b = (byte)i;
		System.out.println("int to byte : " 
		+ i + ":" + b);
		
		i = (int)d;
		System.out.println("double to int : " 
				+ d + ":" + i);
		
		b = (byte)d;
		
		System.out.println("double to byte : " 
				+ d + ":" + b);
	}

}
