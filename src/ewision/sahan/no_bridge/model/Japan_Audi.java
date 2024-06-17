package ewision.sahan.no_bridge.model;

import ewision.sahan.no_bridge.architecture.Engine;

/**
 *
 * @author ksoff
 */
public class Japan_Audi extends Engine {

    @Override
    public void assemble() {
        System.out.println("Japan Audi Type: " + type);
        System.out.println("Japan Audi Speed: " + speed);
    }

}
