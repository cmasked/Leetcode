import java.util.HashMap;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[k];

        // Step 1: Count frequencies
        for (int i = 0; i < nums.length; i++) {
            // Note: Fixed "getOrDefault" to "map.getOrDefault"
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Step 2: Find the top k most frequent elements
        for (int i = 0; i < k; i++) {
            int maxFreq = -1;
            int mostFrequentElement = 0;

            // Find the element with the current highest frequency
            for (int key : map.keySet()) {
                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    mostFrequentElement = key;
                }
            }

            // Put it in your answer array
            answer[i] = mostFrequentElement;

            // Remove it from the map so it isn't picked again in the next loop
            map.remove(mostFrequentElement);
        }

        return answer;
    }
}
