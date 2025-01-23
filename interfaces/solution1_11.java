package interfaces;

public class solution1_11 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Mouse mouse = new Mouse();

        dog.move();
        dog.eat();

        cat.move();
        cat.eat();
        cat.beEaten();

        mouse.move();
        mouse.beEaten();
    }

    public interface Movable {
        void move();
    }

    public interface Edible {
        void beEaten();
    }

    public interface Eat {
        void eat();
    }

    public static class Cat implements Movable, Edible, Eat {
        @Override
        public void move() {
            System.out.println("Cat is moving around.");
        }

        @Override
        public void beEaten() {
            System.out.println("Cat is being eaten.");
        }

        @Override
        public void eat() {
            System.out.println("Cat is eating someone.");
        }
    }

    public static class Mouse implements Movable, Edible {
        @Override
        public void move() {
            System.out.println("Mouse is moving around.");
        }

        @Override
        public void beEaten() {
            System.out.println("Mouse is being eaten.");
        }
    }

    public static class Dog implements Movable, Eat {
        @Override
        public void move() {
            System.out.println("Dog is moving around.");
        }

        @Override
        public void eat() {
            System.out.println("Dog is eating someone.");
        }
    }
}

