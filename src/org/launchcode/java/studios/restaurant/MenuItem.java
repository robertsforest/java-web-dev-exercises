package org.launchcode.java.studios.restaurant;

public class MenuItem {
    private int price;
    private String description;
    private String category;
    private Boolean isNew;
    private String name;

    public MenuItem (int price, String description, String category, Boolean isNew, String name){
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }




}
