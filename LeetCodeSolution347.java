import java.util.List;
import java.util.Queue;

public class LeetCodeSolution347 {

    public List<Integer> topKFrequent(int[] nums, int k) {
        // map to hold frequencies
        Map<Integer, Integer> map = new TreeMap<>();
        // fill map with freq: num, freq
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        // set containing the results
        List<Integer> results = new ArrayList<>(k);
        // get the most frequent
        for (int i = 0; i < k; i++) {
            int maxCount = Integer.MIN_VALUE;
            int key = 0;
            // iterate through sets for most frequent
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    key = entry.getKey();
                }
            }
            // remove from the set.
            map.remove(key);
            results.add(key);
        }
        return results;
    }

    public static void main(String[] args) { }
}