package exercises.Excercise3;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,3,4,5,2,3,13,12,43,33,11,2,3,4,5));
        Scanner input = new Scanner(System.in);

        System.out.println(listSum(myList));

        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("My mother told me to pick these very best ones and you are not it you idiot. Use your words length fives".split(" ")));

        printEnteredLengthWords(wordList, input);

        input.close();
    }

    static int listSum(ArrayList<Integer> inArray){
        int sum = 0;
        for(int el : inArray){
            sum += el;
        }
        return sum;
    }

    static void printEnteredLengthWords(ArrayList<String> inArray, Scanner input){
        System.out.println("What length of words would you like? ");
        int length = input.nextInt();
        for(String word : inArray){
            if(word.length() == length)
                System.out.println(word);
        }
    }

}
