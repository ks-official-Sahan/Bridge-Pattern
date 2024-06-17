package ewision.sahan.bridge.model;

import ewision.sahan.bridge.architecture.Engine;
import ewision.sahan.bridge.architecture.WorkShop;

/**
 *
 * @author ksoff
 */
public class USA_WorkShop extends WorkShop {

    public USA_WorkShop(Engine engine) {
        super(engine);
    }
    
    @Override
    public void setType() {
        engine.setType("USA");
    }

    @Override
    public void setSpeed() {
        engine.setSpeed(250);
    }

    
}
