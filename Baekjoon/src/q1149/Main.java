package q1149;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int home = sc.nextInt();
		int[][] inp = new int[0][3];
		for (int i = 0; i < inp.length; i++) {
			for (int j =0; j < inp[i].length; j++) {
				inp[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		for (int i = 0; i <inp.length; i++) {
			for (int j = 0; j < inp[i].length; j++) {
				System.out.printf(inp[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < inp.length; i++) {
			v[0][i] = inp[0][i];
		}
		for (int i =1; i <inp.length; i++)
		{
			v[i][0] = inp[i][0] + Math.min(inp[i-1][1],  inp[i-1][2]);
			v[i][1] = inp[i][1] + Math.min(inp[i-1][1],  inp[i-1][2]);
			v[i][2] = inp[i][2] + Math.min(inp[i-1][1],  inp[i-1][2]);
	}

}
