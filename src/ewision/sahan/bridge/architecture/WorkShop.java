package ewision.sahan.bridge.architecture;

/**
 *
 * @author ksoff
 */
public abstract class WorkShop {
    
    protected Engine engine;

    public WorkShop(Engine engine) {
        this.engine = engine;
    }
    
    public abstract void setType();

    public abstract void setSpeed();
    
    public void process() {
        setType();
        setSpeed();
        engine.assemble();
    }
    
}
