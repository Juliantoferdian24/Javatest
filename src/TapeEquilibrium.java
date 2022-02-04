public class TapeEquilibrium {
    public static int solution(int[] A) {
        int sumAllElement = 0;
        for (int j : A) {
            sumAllElement += j;
        }
        int sumFirstPart = 0;
        int sumSecondPart = 0;
        int currentDifference = Integer.MAX_VALUE;
        int minDifference = Integer.MAX_VALUE;
        for (int p = 0; p < A.length-1; p++) {
            sumFirstPart += A[p];
            sumSecondPart = sumAllElement - sumFirstPart;
            currentDifference = Math.abs(sumFirstPart - sumSecondPart);
            minDifference = Math.min(minDifference, currentDifference);
        }
        return minDifference;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3, 1, 2, 4, 3};
        System.out.println(solution(arr));
    }
}
