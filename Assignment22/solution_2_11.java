package Assignment22;

public class solution_2_11 {
    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String elementSqrt = "The square root for the number ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double sqrtValue = Math.sqrt(element);
            System.out.println(elementSqrt + element + " is " + sqrtValue);
        }
    }
}
