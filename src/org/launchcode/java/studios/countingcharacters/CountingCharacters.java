package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String myString = "If the product of two terms is zero then common sense says at least one " +
                "of the two terms has to be zero to start with. So if you move all the terms over to " +
                "one side, you can put the quadratics into a form that can be factored allowing that" +
                " side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward" +
                " from there.";

        HashMap<String,Integer> charCounts = new HashMap<>();
        Boolean promptForString = false;
        Boolean considerCase = false;
        Boolean alphabetOnly = false;

        System.out.println("Enter custom string? (y/n)");
        if(input.nextLine().toLowerCase().charAt(0) == 'y'){
            promptForString = true;
        }

        System.out.println("Case sensitive? (y/n)");
        if(input.nextLine().toLowerCase().charAt(0) == 'y'){
            considerCase = true;
        }

        System.out.println("Consider only letters? (y/n)");
        if(input.nextLine().toLowerCase().charAt(0) == 'y'){
            alphabetOnly = true;
        }

        if(promptForString){
            System.out.println("*** Get Character Counts ***\nPlease enter the string: ");
            myString = input.nextLine();
        }

        if(!considerCase){
            myString = myString.toLowerCase();
        }

        char[] charArray = myString.toCharArray();

        for(int i = 0; i < charArray.length; i++){
            if(alphabetOnly && !Character.isLetter(charArray[i])) {
                continue;
            } else {
                String currentKey = Character.toString(charArray[i]);
                charCounts.putIfAbsent(currentKey, 0);
                charCounts.replace(currentKey, charCounts.get(currentKey) + 1);
            }
        }

        for(String key : charCounts.keySet()){
            System.out.println(key + ": " + charCounts.get(key));
        }

        input.close();
    }
}
