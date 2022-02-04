import java.util.Arrays;

public class SmallestArray {

    public static int smallestArray(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static int biggestArray(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
        System.out.println(smallestArray(arr));
        System.out.println(biggestArray(arr));
    }
}
