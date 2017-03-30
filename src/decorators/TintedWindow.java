package decorators;

public class TintedWindow extends AbstractWindowDecorator implements Window {

    public TintedWindow(Window window) {
        super(window);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", is tinted";
    }

}
