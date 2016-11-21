
public class ThreeDMatrix {

	public static void main(String args[]){

		int i = 0, j = 0, k = 0;
		int threeD[][][] = new int[3][4][5];

		for(i=0; i < 3; i++){
			for(j=0; j < 4; j++){
				for(k=0; k < 5; k++){
					threeD[i][j][k] = i*j*k;


				}
			}

		}

		for(i = 0; i < 3; i++){
			for(j = 0; j < 4; j++){
				for(k = 0; k < 5; k++){
					System.out.print(threeD[i][j][k] + " ");

				}

				System.out.println();

			}
			System.out.println();
		}

	}



}
