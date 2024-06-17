package ewision.sahan.bridge.model;

import ewision.sahan.bridge.architecture.Engine;

/**
 *
 * @author ksoff
 */
public class BMW extends Engine {

    @Override
    public void assemble() {
        System.out.println("BMW type: " + getType());
        System.out.println("BMW speed: " + getSpeed());
    }

}
