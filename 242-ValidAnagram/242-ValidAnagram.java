// Last updated: 29/06/2026, 16:40:20
1class Solution {
2    public boolean isAnagram(String s, String t) {
3
4        HashMap<Integer, Integer> map = new HashMap<>();
5
6        if (s.length() != t.length()) {
7            return false;
8        }
9
10        for (int i = 0; i < s.length(); i++) {
11
12            if (map.containsKey(s.charAt(i) - 'a')) {
13
14                int value = map.get(s.charAt(i) - 'a');
15                value++;
16
17                map.put(s.charAt(i) - 'a', value);
18
19            } else {
20
21                map.put(s.charAt(i) - 'a', 1);
22
23            }
24
25            if (map.containsKey(t.charAt(i) - 'a')) {
26
27                int value = map.get(t.charAt(i) - 'a');
28                value--;
29
30                map.put(t.charAt(i) - 'a', value);
31
32            } else {
33
34                map.put(t.charAt(i) - 'a', -1);
35
36            }
37        }
38
39        for (int value : map.values()) {
40            if (value != 0) {
41                return false;
42            }
43        }
44
45        return true;
46    }
47}