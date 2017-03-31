package decorators;

/**
 * A window that is broken which means that it is always considered open.
 * 
 * @author Jason Wong
 *
 */
public class BrokenWindow extends AbstractWindowDecorator implements Window {

    public BrokenWindow(Window window) {
        super(window);

    }

    @Override
    public void open() {
        // do nothing since it's broken
    }

    @Override
    public void close() {
        // do nothing since it's broken
    }

    @Override
    public boolean isOpen() {
        return true; // It's always open since it's broken
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", is broken";
    }
}
