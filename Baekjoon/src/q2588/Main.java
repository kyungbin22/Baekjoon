package q2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Num1 = sc.nextInt();
		int Num2 = sc.nextInt();
		sc.close();
		
		int Num3 = Num1 * (Num2 % 10);
		int Num4 = Num1 * (Num2 % 100 / 10);
		int Num5 = Num1 * (Num2 / 100);
		
		int Sum = Num3 + Num4 * 10 + Num5 * 100;
		
		System.out.println(Num3);
		System.out.println(Num4);
		System.out.println(Num5);
		System.out.println(Sum);
	}

}
