package decorators;

/**
 * A window that can be opened and closed.
 * 
 * @author Jason Wong
 *
 */
public interface Window {

    /**
     * This will open the window if it is not open already. If it is already
     * open, it remains open.
     */
    public void open();

    /**
     * This will close the window if it is not closed already. If it is already
     * closed, it will remain closed.
     */
    public void close();

    /**
     * This will return true if the window is open; false, otherwise.
     * 
     * @return true if the window is open; false, otherwise.
     */
    public boolean isOpen();

    /**
     * This will return the description of the window.
     * 
     * @return the description of the window.
     */
    public String getDescription();
}
