public class Main{
    public static void main(String[] args) {

        String name;

        int age;

        String city;

    }
}
//Task 1

public class Main{
    public static void main(String[] args) {

        int a = 5; b = 10;

    }
}
//Task 2

public class Main{
    public static void main(String[] args) {

        int currentYear = 3126;
        int age = 8;
        int yearOfBirth = currentYear - age;

        System.out.println(yearOfBirth);
    }
}
//Task 3

public class Main {
    public static void main(String[] args) {
        String word = "Hello";
        String phrase = "Welcome to Java programming!";
        String line = "This is a single line of text.";
        String text = "Java is versatile.";

        System.out.println(word);
        System.out.println(phrase);
        System.out.println(line);
        System.out.println(text);
    }
}
//Task 4

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the outside temperature: ");
        int temperature = scanner.nextInt();

        if (temperature < 0) {
            System.out.println("it’s cold outside");
        } else {
            System.out.println("it’s warm outside");
        }
    }
}
//Assignment 1.2
//Task 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int age = scanner.nextInt();

        if (age >= 18 && age <= 28) {
            System.out.println(name + ", come to the military registration and enlistment office");
        }
    }
}

//Task 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter body temperature: ");
        double temperature = scanner.nextDouble();

        boolean isHigh;
        boolean isLow;

        isHigh = temperature > 37.5;
        isLow = temperature < 36.0;

        if (isHigh) {
            System.out.println("Body temperature is high.");
        } else if (isLow) {
            System.out.println("Body temperature is low.");
        } else {
            System.out.println("Body temperature is normal.");
        }
    }
}
//Task 3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 20 || age > 60) {
            System.out.println("you don’t have to work");
        }
    }
}
//Task 4

public class Main {
    public static void main(String[] args) {
        String quote = "I will never work for pennies.";

        int count = 1;

        while (count <= 100) {
            System.out.println(quote);
            count++;
        }
    }
}
//Task 5

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
//Task 9

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;

        while (number <= 100) {
            if (number % 3 == 0) {
                number++;
                continue;
            }

            sum += number;
            number++;
        }

        System.out.println("The sum of numbers from 1 to 100 not divisible by 3 is: " + sum);
    }
}
//Task 8

public class Main {
    public static void main(String[] args) {
        int height = 5;
        int width = 10;

        int i = 0;
        while (i < height) {
            int j = 0;
            while (j < width) {
                System.out.print("Q");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
//Task 7

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("ENTER")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer or 'ENTER' to stop.");
            }
        }

        System.out.println("Total sum: " + sum);
    }
}
//Task 6


