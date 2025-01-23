package interfaces;

public class solution1_5 {
    public static void main(String[] args) throws Exception {
        BeerLover beerLover = new BeerLover();
        beerLover.askForMore("Another round, please!");
        beerLover.sayThankYou();
        System.out.println("Ready to go home? " + beerLover.isReadyToGoHome());
        beerLover.sleepOnTheFloor();
    }

    public interface Drinker {
        void askForMore(String message);
        void sayThankYou();
        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;
        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {
        @Override
        public void askForMore(String message) {
            System.out.println("BeerLover asks: " + message);
        }

        @Override
        public void sayThankYou() {
            System.out.println("BeerLover says: Thank you!");
        }

        @Override
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }

        @Override
        public void sleepOnTheFloor() {
            System.out.println("BeerLover is sleeping on the floor...");
        }
    }
}
