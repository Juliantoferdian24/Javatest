import java.util.Arrays;

public class PermCheck {
    public static int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 1; i <= A.length; i++) {
            if (A[i - 1] != i) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{};
        System.out.println(solution(arr));
    }
}
