package interfaces;

class Solution1_2 {
    public void main(String[] args) {
        Dog dog = new Dog();
        dog.move();
        dog.eat();

        Duck duck = new Duck();
        duck.move();
        duck.fly();
        duck.eat();

        Car car = new Car();
        car.move();

        Airplane airplane = new Airplane();
        airplane.move();
        airplane.fly();
    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {
        @Override
        public void move() {
            System.out.println("Dog is moving.");
        }

        @Override
        public void eat() {
            System.out.println("Dog is eating.");
        }
    }

    public class Duck implements CanMove, CanFly, CanEat {
        @Override
        public void move() {
            System.out.println("Duck is moving.");
        }

        @Override
        public void fly() {
            System.out.println("Duck is flying.");
        }

        @Override
        public void eat() {
            System.out.println("Duck is eating.");
        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {
            System.out.println("Car is moving.");
        }
    }

    public class Airplane implements CanMove, CanFly {
        @Override
        public void move() {
            System.out.println("Airplane is moving.");
        }

        @Override
        public void fly() {
            System.out.println("Airplane is flying.");
        }
    }
}
