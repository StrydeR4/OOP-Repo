package interfaces;

public class solution1_10 {
    public static void main(String[] args) throws Exception {
        Manager manager = new Manager();
        Subordinate subordinate = new Subordinate();

        manager.use(subordinate);
        subordinate.startToWork();
        System.out.println("Manager inspires others: " + manager.inspiresOthersToWork());
    }

    interface Person {
        void use(Person person);
        void startToWork();
    }

    interface HasManagementPotential {
        boolean inspiresOthersToWork();
    }

    interface Secretary extends Person {
    }

    interface Boss extends Person, HasManagementPotential {
    }

    static class Manager implements Boss {
        @Override
        public void use(Person person) {
            person.startToWork();
        }

        @Override
        public void startToWork() {
            System.out.println("Manager is starting to work.");
        }

        @Override
        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    static class Subordinate implements Secretary {
        @Override
        public void use(Person person) {
            System.out.println("Subordinate is working under someone.");
        }

        @Override
        public void startToWork() {
            System.out.println("Subordinate is starting to work.");
        }
    }
}

