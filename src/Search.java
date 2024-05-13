//#1
import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = keyboard.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter numbers in the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = keyboard.nextInt();
        }

        System.out.print("Enter a number to be searched: ");
        int key = keyboard.nextInt();

        int repetition = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] == key) {
                repetition++;
            }
        }

        if (repetition > 0) {
            System.out.println("The number (" + key + ") is found " + repetition + " times in the array.");
        } else {
            System.out.println("The number " + key + " is not found in the array");
        }
    }
}








