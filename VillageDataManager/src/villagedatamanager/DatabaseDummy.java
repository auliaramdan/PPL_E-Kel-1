/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villagedatamanager;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author AdminIGS
 */
public class DatabaseDummy {
        List<Orang> orang = new ArrayList<Orang>();
        
        public DatabaseDummy() {
            orang.add(new Orang("Ramdan", 42, 70, "Lab IGS", 12));
        }
        
        public List<Orang> getTable() {
            //System.out.print(orang.get(0).getNama());
            return orang;
        }
}
