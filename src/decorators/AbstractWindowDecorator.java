package decorators;

public abstract class AbstractWindowDecorator implements Window {

    private Window currentWindow;

    public AbstractWindowDecorator(Window window) {
        this.currentWindow = window;
    }

    public void open() {
        currentWindow.open();
    }

    public void close() {
        currentWindow.close();
    }

    public boolean isOpen() {
        return currentWindow.isOpen();
    }

    public String getDescription() {
        return currentWindow.getDescription();
    }
}
