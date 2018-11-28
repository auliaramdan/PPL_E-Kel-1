/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villagedatamanager;

/**
 *
 * @author HP 14 - BS001TX
 */
public class VillageDataManager {
    private static HomeScreen homescreen;

    /**
     * @param args the command line arguments
     */
    //private HomeScreen homescreen;
    public static void main(String[] args) {
        homescreen = new HomeScreen();
        homescreen.setVisible(true);
        // TODO code application logic here
        
    }
    
}