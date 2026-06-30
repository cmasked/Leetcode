// Last updated: 30/06/2026, 14:42:05
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String,List<String>>map=new HashMap<>();
4        
5        
6        
7        for(int i=0;i<strs.length;i++){
8            
9            String input=strs[i];
10            char[] newString = input.toCharArray();
11            Arrays.sort(newString);
12            String key = new String(newString);
13            if(!map.containsKey(key)){
14            List<String> list = new ArrayList<>();
15            map.put(key,list);
16
17            }
18            
19            List<String> list=map.get(key);
20            list.add(strs[i]);
21            
22            
23            
24        }
25        List<List<String>> answer = new ArrayList<>();
26
27        for (List<String> list : map.values()) {
28            answer.add(list);
29                                        }
30
31        return answer;
32        
33
34        
35    }
36}