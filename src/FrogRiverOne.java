import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public static int solution(int X, int[] A) {
        Set<Integer> s = new HashSet<>();
        for (int n = 1; n <= X; n++) {
            s.add(n);
        }

        for (int i = 0; i < A.length; i++) {
            int n = A[i];
            if (s.contains(n)) {
                s.remove(n);
                if (s.isEmpty()) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 1, 4, 3, 5, 2, 4};
        System.out.println(solution(5, arr));
    }
}
