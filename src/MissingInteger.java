import java.util.HashSet;

public class MissingInteger {
    public static int solution(int[] A) {
        HashSet<Integer> nums = new HashSet<Integer>();
        for (int n = 1; n <= A.length + 1; n++) {
            nums.add(n);
        }
        for (int a : A) {
            nums.remove(a);
        }
        return nums.iterator().next();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(solution(arr));

    }
}
