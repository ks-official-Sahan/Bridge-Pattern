package ewision.sahan.no_bridge.model;

import ewision.sahan.no_bridge.architecture.Engine;

/**
 *
 * @author ksoff
 */
public class USA_Audi extends Engine {

    @Override
    public void assemble() {
        System.out.println("USA Audi Type: " + type);
        System.out.println("USA Audi Speed: " + speed);
    }

}
