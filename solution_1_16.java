package Assignment21;

import java.util.Scanner;

public class solution_1_16 {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();

        array = new char[height][2 * height - 1];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height - 1; j++) {
                array[i][j] = ' ';
            }
        }

        for (int i = 0; i < height; i++) {
            int middle = height - 1;
            for (int j = middle - i; j <= middle + i; j++) {
                array[i][j] = '#';
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height - 1; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
