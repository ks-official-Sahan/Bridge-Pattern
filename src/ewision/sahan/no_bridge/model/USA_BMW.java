package ewision.sahan.no_bridge.model;

import ewision.sahan.no_bridge.architecture.Engine;

/**
 *
 * @author ksoff
 */
public class USA_BMW extends Engine {

    @Override
    public void assemble() {
        System.out.println("USA BMW Type: " + type);
        System.out.println("USA BMW Speed: " + speed);
    }
    
}
