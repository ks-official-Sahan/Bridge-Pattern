package ewision.sahan.bridge.architecture;

/**
 *
 * @author ks.official.sahan
 */
public abstract class Engine {

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }
    
    private String type;
    
    private int speed;
    
    public abstract void assemble();

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
}
