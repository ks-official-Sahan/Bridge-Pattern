package ewision.sahan.no_bridge;

import ewision.sahan.no_bridge.model.Japan_Audi;
import ewision.sahan.no_bridge.model.Japan_BMW;
import ewision.sahan.no_bridge.model.USA_Audi;
import ewision.sahan.no_bridge.model.USA_BMW;

/**
 *
 * @author ksoff
 */
public class InitializeNoBridge {

    public static void init() {
        Japan_Audi jAudi = new Japan_Audi();
        jAudi.assemble();
        
        USA_Audi uAudi = new USA_Audi();
        uAudi.assemble();

        Japan_BMW jBMW = new Japan_BMW();
        jBMW.assemble();
        
        USA_BMW uBMW = new USA_BMW();
        uBMW.assemble();
    }
    
}
