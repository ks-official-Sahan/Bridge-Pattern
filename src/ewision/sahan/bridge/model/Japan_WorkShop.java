package ewision.sahan.bridge.model;

import ewision.sahan.bridge.architecture.Engine;
import ewision.sahan.bridge.architecture.WorkShop;

/**
 *
 * @author ksoff
 */
public class Japan_WorkShop extends WorkShop {

    public Japan_WorkShop(Engine engine) {
        super(engine);
    }

    @Override
    public void setType() {
        engine.setType("Japan");
    }

    @Override
    public void setSpeed() {
        engine.setSpeed(280);
    }

    
}
