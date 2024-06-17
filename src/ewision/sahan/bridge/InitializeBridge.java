package ewision.sahan.bridge;

import ewision.sahan.bridge.model.Audi;
import ewision.sahan.bridge.model.BMW;
import ewision.sahan.bridge.model.Japan_WorkShop;
import ewision.sahan.bridge.model.USA_WorkShop;

/**
 *
 * @author ksoff
 */
public class InitializeBridge {

    public static void init() {
        USA_WorkShop usaWorkShop = new USA_WorkShop(new BMW());
        usaWorkShop.process();

        usaWorkShop.setEngine(new Audi());
        usaWorkShop.process();
        
        Japan_WorkShop japanWorkShop = new Japan_WorkShop(new BMW());
        japanWorkShop.process();
        
        japanWorkShop.setEngine(new Audi());
        japanWorkShop.process();
    }
    
}
