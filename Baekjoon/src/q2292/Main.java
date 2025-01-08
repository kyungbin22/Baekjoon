package q2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if (num == 1) {
			System.out.println("1");
			return;
		}
		
		int layer = 1;
		int range = 1;
		
		while (range < num) {
			range += 6 * layer;
			layer++;
		}
		
		System.out.println(layer);
	}

}
