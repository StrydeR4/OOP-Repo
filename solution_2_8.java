package Assignment22;

public class solution_2_8 {
    public static void main(String[] args) {
        long number = 5;
        System.out.println("Cube of " + number + " is: " + cube(number));

        number = 123456789L;
        System.out.println("Cube of " + number + " is: " + cube(number));
    }

    public static long cube(long number) {
        return number * number * number;
    }
}
