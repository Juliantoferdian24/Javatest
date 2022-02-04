import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public static int solution(int[] A) {
//        int[] unique = Arrays.stream(A).distinct().toArray();
//        return unique.length;
        if (A.length == 0) return 0;
        Set<Integer> aSet = new HashSet<>();
        for (int j : A) {
            aSet.add(j);
        }
        return aSet.size();
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 5, 6, 7, 1};
        System.out.println(solution(arr));
    }
}
