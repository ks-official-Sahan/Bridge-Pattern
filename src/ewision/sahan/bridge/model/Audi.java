package ewision.sahan.bridge.model;

import ewision.sahan.bridge.architecture.Engine;

/**
 *
 * @author ksoff
 */
public class Audi extends Engine {

    @Override
    public void assemble() {
        System.out.println("Audi type: " + getType());
        System.out.println("Audi speed: " + getSpeed());
    }

}
