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
public class Empty implements viewtablestate{
    ViewTable vtable; 
    public Empty(ViewTable vtable){
        this.vtable = vtable;
    }
    public void viewall()
    {
        vtable.setstate(new Uneditable(vtable));
    }
    public void search(){
        vtable.setstate(new Editable(vtable));
    }
    public void clicksave(){
    }
    public void clickdelete(){
        
    }
}
