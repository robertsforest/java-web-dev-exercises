package exercises;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int length;
        int width;

        System.out.print("Please enter length: ");
        length = input.nextInt();

        System.out.print("Please enter width: ");
        width = input.nextInt();

        System.out.println("The area of this rectangle is " + length*width);
    }
}
