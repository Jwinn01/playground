package decorators;

/**
 * A simple window that implements the window interface.
 * 
 * @author Jason Wong
 *
 */
public class SimpleWindow implements Window {

    /** The boolean to determine whether this window is opened or closed. */
    protected boolean isOpen;

    public SimpleWindow() {
        this.isOpen = false;
    }

    @Override
    public void open() {
        this.isOpen = true;
    }

    @Override
    public void close() {
        this.isOpen = false;
    }

    @Override
    public boolean isOpen() {
        return this.isOpen;
    }

    @Override
    public String getDescription() {
        return "Simple Window";
    }
}
