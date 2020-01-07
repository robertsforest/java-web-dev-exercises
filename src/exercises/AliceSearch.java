package exercises;
import java.util.Scanner;

public class AliceSearch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String aliceText = "Alice was beginning to get very " +
                "tired of sitting by her sister on the bank, and " +
                "of having nothing to do: once or twice she had " +
                "peeped into the book her sister was reading, but " +
                "it had no pictures or conversations in it, 'and " +
                "what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?'";
        String newAliceText = "lorem ipsum";
        String searchTerm;
        int foundWordIndex;
        System.out.println("What word do you want to search for? ");
        searchTerm = input.next();
        foundWordIndex = aliceText.toLowerCase().indexOf(searchTerm.toLowerCase());
        if(foundWordIndex >= 0){
            System.out.println("This word is found at index " + foundWordIndex);
            System.out.println("The word has length " + searchTerm.length());
            newAliceText = aliceText.substring(0,foundWordIndex) + aliceText.substring(foundWordIndex + searchTerm.length());
        } else {
            System.out.println("The word was not found.");
        }
        System.out.println(newAliceText);
    }
}
