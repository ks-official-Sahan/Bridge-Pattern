package ewision.sahan.application;

import ewision.sahan.bridge.InitializeBridge;
import ewision.sahan.no_bridge.InitializeNoBridge;

/**
 *
 * @author ksoff
 */
public class Application {

    public static void main(String[] args) {

        System.out.println("Bridge");        
        InitializeBridge.init();
        
        System.out.println("No-Bridge");        
        InitializeNoBridge.init();
        
    }
    
}
