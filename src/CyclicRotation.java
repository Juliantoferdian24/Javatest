import java.util.Arrays;

public class CyclicRotation {
//    public static int[] solution(int[] A, int K) {
//        int [] rotatedA = new int[A.length];
//
//        for(int i=0; i<A.length; i++) {
//            //rotated index needs to "wrap" around end of array
//            int rotatedIndex = (i + K) % A.length;
//
//            rotatedA[rotatedIndex] = A[i];
//        }
//        return rotatedA;
//    }

    public static int[] solution(int[] A, int K) {
        if (A.length == 0 || K < 0) {
            return A;
        }
        int i = 0, j = A.length - 1;
        for (int a = 0; a < K; a++) {
            while (i != j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
            }
            i = 0;
        }
        return A;
    }
    public static void main(String[] args) {
        int A[] = new int[]{3, 8, 9, 7, 6};


        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(solution(A, 3)));
    }
}
