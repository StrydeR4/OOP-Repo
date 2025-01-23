package interfaces;

class Solution1_3 {
    public static void main(String[] args) {
        Human human = new Human();
        human.run();
        human.swim();

        Duck duck = new Duck();
        duck.fly();
        duck.run();
        duck.swim();

        Penguin penguin = new Penguin();
        penguin.run();
        penguin.swim();

        Airplane airplane = new Airplane();
        airplane.fly();
    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public static class Human implements CanRun, CanSwim {
        @Override
        public void run() {
            System.out.println("Human is running.");
        }

        @Override
        public void swim() {
            System.out.println("Human is swimming.");
        }
    }

    public static class Duck implements CanFly, CanRun, CanSwim {
        @Override
        public void fly() {
            System.out.println("Duck is flying.");
        }

        @Override
        public void run() {
            System.out.println("Duck is running.");
        }

        @Override
        public void swim() {
            System.out.println("Duck is swimming.");
        }
    }

    public static class Penguin implements CanRun, CanSwim {
        @Override
        public void run() {
            System.out.println("Penguin is running.");
        }

        @Override
        public void swim() {
            System.out.println("Penguin is swimming.");
        }
    }

    public static class Airplane implements CanFly {
        @Override
        public void fly() {
            System.out.println("Airplane is flying.");
        }
    }
}
