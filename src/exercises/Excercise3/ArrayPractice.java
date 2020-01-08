package exercises.Excercise3;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[] fib = {1,1,2,3,5,8};
        for (int el: fib) {
            if(el % 2 == 1) {
                System.out.println(el);
            }
        }

        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] nonsense = seuss.split("\\.");
        System.out.println(Arrays.toString(nonsense));
    }
}
