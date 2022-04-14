package tiket;

import java.util.HashSet;
import java.util.Set;

public class Microsoft {
    public static void main(String[] args) {
        int[] nums1 = {7};
        int[] nums2 = {4,3};
        int[] nums3 = {11, 1, 8, 12, 14};
        int[] nums4 = {5 ,5 ,5, 5, 5};
        int[] nums5 = {4, 10, 8, 5, 9};
        System.out.println(solve(nums1));
        System.out.println(solve(nums2));
        System.out.println(solve(nums3));
        System.out.println(solve(nums4));
        System.out.println(solve(nums5));
    }

    private static boolean solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            if(set.contains(n-1) || set.contains(n+1))
                return true;
            set.add(n);
        }
        return false;
    }
}
