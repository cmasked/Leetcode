class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Integer, Integer> map = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {

            if (map.containsKey(s.charAt(i) - 'a')) {

                int value = map.get(s.charAt(i) - 'a');
                value++;

                map.put(s.charAt(i) - 'a', value);

            } else {

                map.put(s.charAt(i) - 'a', 1);

            }

            if (map.containsKey(t.charAt(i) - 'a')) {

                int value = map.get(t.charAt(i) - 'a');
                value--;

                map.put(t.charAt(i) - 'a', value);

            } else {

                map.put(t.charAt(i) - 'a', -1);

            }
        }

        for (int value : map.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}