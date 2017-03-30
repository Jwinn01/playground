package decorators;

public class WindowTest {

    public static void main(String[] args) {

        Window window = new SimpleWindow();
        System.out.println("Window Open?: " + window.isOpen());
        System.out.println("Window Description: " + window.getDescription());

        window.open();

        window = new TintedWindow(window);
        System.out.println("Window Open?: " + window.isOpen());
        System.out.println("Window Description: " + window.getDescription());

    }
}
