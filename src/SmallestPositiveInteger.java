public class SmallestPositiveInteger {
    public static int solution(int[] A) {
        int n = A.length;
        boolean[] present = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            if (A[i] > 0 && A[i] <= n)
                present[A[i]] = true;
        }
        for (int i = 1; i <= n; i++)
            if (!present[i])
                return i;
        return n + 1;
    }

    public static void main(String[] args) {
        int A[] = {-1,-3};
        System.out.println(solution(A));
    }
}
