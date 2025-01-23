package interfaces;

public class solution1_16 {
    public static void main(String[] args) throws Exception {
        Fox fox = new Fox();
        System.out.println(fox.getName());
    }

    public interface Animal {
        default String getColor() {
            return "Red";
        }

        default Integer getAge() {
            return 5;
        }
    }

    public static class Fox implements Animal {
        public String getName() {
            return "Fox.";
        }
    }
}
