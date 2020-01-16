package org.launchcode.java.studios.restaurant;
import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

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

    public void addMenuItem(int price, String description, String category, Boolean isNew, String name){
        MenuItem newItem = new MenuItem(price, description, category, isNew, name);
//        System.out.println("This is the new item " + newItem.getName());
        if(menuItems.contains(newItem)){
            System.out.println("That item already exists in the menu. Please add a different item or remove it.");
        } else {
            menuItems.add(newItem);
        }
    }

    public void removeMenuItem(int index){
        menuItems.remove(index);
    }

    public void printMenuItem(int index){
        System.out.println("\nMenu Item: " + menuItems.get(index).getName() + " -- Description: " + menuItems.get(index).getDescription());
    }

    public void printMenu(){
        System.out.println("-----------------\nToday's Menu");
        for(MenuItem item: menuItems){
            System.out.println("Menu Item: " + item.getName() + " -- Description: " + item.getDescription());
        }
    }
}
