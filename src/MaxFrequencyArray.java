import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyArray {
    public static int maxFreqArray(int []arr){
        // Insert all elements in hash
        Map<Integer, Integer> hp = new HashMap<Integer, Integer>();

        for (int key : arr) {
            if (hp.containsKey(key)) hp.put(key, hp.get(key) + 1);
            else hp.put(key, 1);
        }

        // find max frequency.
        int max_count = 0, res = -1;

        for(Map.Entry<Integer, Integer> val : hp.entrySet()) {
            if (max_count < val.getValue()) {
                res = val.getKey();
                max_count = val.getValue();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {10,50,20,40,50,60,30};
        System.out.println(maxFreqArray(arr));
    }
}
