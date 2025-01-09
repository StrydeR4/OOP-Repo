package Assignment21;

import java.util.Scanner;

public class solution_1_13 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int maxElement = array[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
        }

        System.out.println(maxElement);

        scanner.close();
    }
}
