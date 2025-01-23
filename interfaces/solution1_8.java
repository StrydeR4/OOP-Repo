package interfaces;

public class solution1_8 {
    public static void main(String[] args) throws Exception {
        Presentable person = new DemoPerson();
        System.out.println("Is person alive? " + person.isAlive());
    }

    public interface Person {
        boolean isAlive();
    }

    public interface Presentable extends Person {
    }

    public static class DemoPerson implements Presentable {
        @Override
        public boolean isAlive() {
            return true;
        }
    }
}

