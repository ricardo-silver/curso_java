package application;

import java.util.Scanner;

public class ExercicioMatrix {

	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);
	     
	     int n = sc.nextInt();	     
	     int m = sc.nextInt();
	     
		 int[][] mat = new int[n][m];
		 
		 for (int i=0; i<mat.length; i++) {
				for (int j=0; j<mat[i].length; j++) {
					mat[i][j] = sc.nextInt();
				}
			}
			
			/* Le numero X */
		 
		 int x = sc.nextInt();
		 
		 for (int i=0; i<mat.length; i++) {
				for (int j=0; j<mat[i].length; j++) {
					if (mat[i][j] == x ) {
						
						System.out.println("Position " + i + "," + j);
						
						/* Left */
						if (j-1 >= 0) {
							System.out.println("Left: " + mat[i][j-1]);
						}
						
						/* Right */
						if (j+1 < mat[i].length) {
							System.out.println("Rigth: " + mat[i][j+1]);
						}
						
						/* Up */
						if (i-1 >= 0) {
							System.out.println("Up: " + mat[i-1][j]);
						}
						
						/* Down */
						if (i+1 < mat.length) {
							System.out.println("Down: " + mat[i+1][j]);
						}
					}
				}
			}
	       
	     sc.close();

	}

}
