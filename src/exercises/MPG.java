package exercises;
import java.util.Scanner;

public class MPG {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int milesDriven;
        int gasUsed;
        System.out.println("How far have you driven in miles? ");
        milesDriven = input.nextInt();
        System.out.println("How much gas have you used in gallons? ");
        gasUsed = input.nextInt();
        System.out.println("Your fuel efficiency in MPG is " + milesDriven/gasUsed);
    }
}
