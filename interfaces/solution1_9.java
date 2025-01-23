package interfaces;

public class solution1_9 {
    public static void main(String[] args) throws Exception {
        CanFly bird = new Bird();
        System.out.println("Bird speed without argument: " + bird.speed());
        System.out.println("Bird speed with argument: " + bird.speed(bird));
    }

    public interface CanMove {
        Double speed();
    }

    public interface CanFly extends CanMove {
        Double speed(CanFly canFly);
    }

    public static class Bird implements CanFly {
        @Override
        public Double speed() {
            return 10.0;
        }

        @Override
        public Double speed(CanFly canFly) {
            return 20.0;
        }
    }
}

