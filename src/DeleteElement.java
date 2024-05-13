//#6
import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {

        int[] arr = {3, 7, 1, 9, 4};

        int indexToDelet = 2;
        System.out.println(deleteElement(arr, indexToDelet));
    }
    public static int[] deleteElement(int[] arr, int indexToDelete) {
        int[] newarr = new int[arr.length - 1];
        for(int i = 0; i < indexToDelet; i++) {
            newarr[i] = arr[i];
        }
        for(int i = indexToDelet + 1; i < arr.length; i++) {
            newarr[i - 1] = arr[i];
        }
        System.out.println(Arrays.toString(newarr));
    }

}
