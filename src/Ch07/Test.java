package Ch07;

public class Test {

	public static void main(String[] args) {
		
		//4
				//   *
				//  ***
				// *****
				//*******
				int i=0;
				int j=0;
				int k=0;
				while(i<4) {
					j=0;
					while(j<=2-i) {
					System.out.println(" ");
					j++;
					}
					k=0;
					while(k<=2*i) {
						System.out.print("*");
						k++;
					}
					System.out.println();
					i++;
				}

	}

}
