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
public class ViewTable {
    private viewtablestate currentstate = null;
    public ViewTable()
    {
        currentstate = new Empty(this);
    }
    public void setstate(viewtablestate state){
        currentstate = state;
    }
    public void viewall()
    {
        //kalau ada guard jadi argumen
        //kalau ada action taruh sebelum perpindahan state
        currentstate.viewall();
    }
    public void search()
    {
        currentstate.search();
    }
    public void clicksave()
    {
        currentstate.clicksave();
    }
    public void clickdelete(){
        currentstate.clickdelete();
    }
}
