package org.launchcode.java.studios.restaurant;

public class Restaurant {
    public static void main(String[] args) {
        Menu myMenu = new Menu();
        myMenu.addMenuItem(1250,"Roasted vegetables and black beans bound by extra sharp cheddar folded" +
                " inside a toasty tortilla","Mexican",true,"Veggie Quesadillas");
        myMenu.addMenuItem(400,"Crispy sweet and salty chips with tomatillo salsa served in a festive " +
                "sombrero","Mexican",true,"Chips and Salsa");
        myMenu.addMenuItem(8999,"12 layers of escalating decadence served in a tote bag",
                "Garbage",false,"Taco Town Taco");
        myMenu.addMenuItem(8999,"a bunch of bad mexican food","Mexican",false,"Taco Town Taco");
        myMenu.printMenu();

        myMenu.printMenuItem(2);

        myMenu.removeMenuItem(2);

        myMenu.printMenu();
    }
}
