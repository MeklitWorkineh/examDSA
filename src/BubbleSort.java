//#4
public class BubbleSort {
    public static void main(String[] args) {
        char[] arr = {'E', 'B', 'C', 'A', 'D'};
        char temp;

        System.out.println("before sorting:");
        for(char n: arr){
            System.out.print(n + " ");
        }
        System.out.println();

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("after sorting:");
        for(char n: arr){
            System.out.print(n + " ");
        }
    }
}
