package Assignment22;

public class solution_2_7 {
    public static void main(String[] args) {
        signIn("Alice");
        signIn("user");
        signIn("Bob");
    }

    public static void signIn(String username) {
        if (username.equals("user")) {
            return;
        }

        System.out.println("Welcome " + username);
        System.out.println("Missed you very much, " + username);
    }
}
