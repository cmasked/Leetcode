// Last updated: 04/10/2026, 22:35:33
1import java.util.HashMap;
2
3class Solution {
4    public int[] topKFrequent(int[] nums, int k) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6        int[] answer = new int[k];
7
8        // Step 1: Count frequencies
9        for (int i = 0; i < nums.length; i++) {
10            // Note: Fixed "getOrDefault" to "map.getOrDefault"
11            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
12        }
13
14        // Step 2: Find the top k most frequent elements
15        for (int i = 0; i < k; i++) {
16            int maxFreq = -1;
17            int mostFrequentElement = 0;
18
19            // Find the element with the current highest frequency
20            for (int key : map.keySet()) {
21                if (map.get(key) > maxFreq) {
22                    maxFreq = map.get(key);
23                    mostFrequentElement = key;
24                }
25            }
26
27            // Put it in your answer array
28            answer[i] = mostFrequentElement;
29
30            // Remove it from the map so it isn't picked again in the next loop
31            map.remove(mostFrequentElement);
32        }
33
34        return answer;
35    }
36}
37