package decorators;

/**
 * A window that can be opened and closed.
 * 
 * @author Jason Wong
 *
 */
public interface Window {

    public void open();

    public void close();

    public boolean isOpen();

    public String getDescription();
}
