package q3040;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[9]; 
        int sum = 0;
        
        for (int i = 0; i < 9; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        int exclude1 = 0, exclude2 = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - (numbers[i] + numbers[j]) == 100) {
                    exclude1 = numbers[i];
                    exclude2 = numbers[j];
                    break;
                }
            }
            if (exclude1 != 0 && exclude2 != 0) break;
        }

        Arrays.sort(numbers);

        for (int num : numbers) {
            if (num != exclude1 && num != exclude2) {
                System.out.println(num);
            }
        }
    }
}
