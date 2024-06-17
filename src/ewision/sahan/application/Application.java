package ewision.sahan.application;

import ewision.sahan.bridge.InititalizeBridge;
import ewision.sahan.no_bridge.InititalizeNoBridge;

/**
 *
 * @author ksoff
 */
public class Application {

    public static void main(String[] args) {

        System.out.println("Bridge");        
        InititalizeBridge.init();
        
        System.out.println("No-Bridge");        
        InititalizeNoBridge.init();
        
    }
    
}
