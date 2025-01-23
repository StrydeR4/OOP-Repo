package interfaces;

public class solution1_6 {
    public static void main(String[] args) throws Exception {
        Screen screen = new Screen();
        screen.onSelect();
        screen.refresh();
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public static class Screen implements Selectable, Updatable {
        @Override
        public void onSelect() {
            System.out.println("Screen selected.");
        }

        @Override
        public void refresh() {
            System.out.println("Screen refreshed.");
        }
    }
}

