/**
 * A decorator is composed of another object and performs embellishments before calling
 * the inner objects method. In this case, the IODecorator is more of a wrapper for
 * the inner manager. It does not perform any additional duties, though it could.
 */
public class IODecorator implements IOManager {

    private IOManager innerManager;

    IODecorator(IOManager ioManager) {
        setInnerManager(ioManager);
    }

    @Override
    public void write(String[] s) {
        innerManager.write(s);
    }

    @Override
    public void read(String[] s) {
        innerManager.read(s);
    }

    private void setInnerManager(IOManager innerManager) {
        this.innerManager = innerManager;
    }

}
