import java.util.Arrays;

public class OddOccurrencesInArray {

    public static int solution(int A[])
    {
        int arr_size = A.length;
        if(arr_size == 1){
            return A[0];
        }
        Arrays.sort(A);
        int i;
        for (i = 0; i < arr_size; i+=2) {
            if(i+1 == arr_size){
                return A[i];
            }
            if(A[i] != A[i+1]){
                return A[i];
            }
        }
        return 0;
    }
//    public static int solution(int A[])
//    {
//        int arr_size = A.length;
//        int i;
//        for (i = 0; i < arr_size; i++) {
//            int count = 0;
//            for (int j = 0; j < arr_size; j++) {
//                if (A[i] == A[j])
//                    count++;
//            }
//            if (count % 2 != 0)
//                return A[i];
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };

        System.out.println(solution(arr));
    }
}
