package ewision.sahan.no_bridge.model;

import ewision.sahan.no_bridge.architecture.Engine;

/**
 *
 * @author ksoff
 */
public class Japan_BMW extends Engine {

    @Override
    public void assemble() {
        System.out.println("Japan BMW Type: " + type);
        System.out.println("Japan BMW Speed: " + speed);
    }
    
}
