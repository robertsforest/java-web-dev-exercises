package org.launchcode.java.studios.restaurant;

import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems;

    public Menu(){
//        ArrayList<MenuItem> menuItems = new ArrayList<>();
//        menuItems.add(new MenuItem());
//        this(menuItems);
    }

    public Menu(ArrayList<MenuItem> menuItems){
        this.menuItems = menuItems;
        this.lastUpdated = Calendar.getInstance().getTime();
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdatedToNow() {
        this.lastUpdated = Calendar.getInstance().getTime();
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void addMenuItem(MenuItem newItem){
        menuItems.add(newItem);
    }

    public void removeMenuItem(int index){
        menuItems.remove(index);
    }
}
