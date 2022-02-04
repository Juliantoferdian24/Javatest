package linkedlist;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void findDuplicates(int[] arr){
        Map<Integer, Integer> hp = new HashMap<>();
        for (int key : arr) {
            if (hp.containsKey(key)) System.out.println(key);
            else hp.put(key, 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,50,20,10,50,60,30};
        findDuplicates(arr);
    }
}
