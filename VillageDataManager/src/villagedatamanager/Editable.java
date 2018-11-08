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
public class Editable implements viewtablestate{
    ViewTable vtable; 
    public Editable(ViewTable vtable){
        this.vtable = vtable;
    }
    public void viewall()
    {
        
    }
    public void search(){
        
    }
    public void clicksave(){
        vtable.setstate(new Editable(vtable));
    }
    public void clickdelete(){
        vtable.setstate(new Empty(vtable));
        
    }
}
