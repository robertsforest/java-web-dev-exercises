package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of your circle: ");
        double radius = -1;
        while (radius < 0) {
            if (input.hasNextDouble()) {
                radius = input.nextDouble();
                if (radius < 0) {
                    System.out.println("That is not a valid radius. Please enter a positive number: ");
                }
            } else {
                System.out.println("Why wouldn't you enter a number? You entered: " + input.next() + " Try again: ");
            }
        }

        System.out.println("The area of a circle with radius " + radius + " is " + Circle.getArea(radius));
    }
}
