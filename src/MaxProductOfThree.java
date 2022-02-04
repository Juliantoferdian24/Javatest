import java.util.Arrays;

public class MaxProductOfThree {
    public static int solution(int[] A) {
        Arrays.sort(A);
        int max1 = A[0] * A[1] * A[A.length - 1];
        int max2 = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        return Math.max(max1, max2);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-3, 1, 2, -2, 5, 6};
        System.out.println(solution(arr));
    }
}
