import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] arr = new int[5];
        int[] arr = {
                0, 1, 2, 3
        };
        arr[3] = 11;
        System.out.println(arr[3]);
        System.out.println(Arrays.toString(arr));
    }
}
