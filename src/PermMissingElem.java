public class PermMissingElem {
    public static int solution(int[] A) {
        if (A.length == 0) return 1;
        int sumArr = 0;
        for (int i = 0; i < A.length; i++) {
            sumArr = sumArr + A[i];
        }
        int sumN = 0;
        for (int i = 1; i <= A.length + 1; i++) {
            sumN = sumN + i;
        }
        if (sumArr == sumN) return A.length;
        return sumN - sumArr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 5};
        System.out.println(solution(arr));
    }
}
