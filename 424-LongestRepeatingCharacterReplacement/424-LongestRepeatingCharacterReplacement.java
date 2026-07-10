// Last updated: 10/07/2026, 11:29:21
1class Solution {
2    public int characterReplacement(String s, int k) {
3        
4        HashMap<Character,Integer> map=new HashMap<>();
5        
6        int l=0;
7        int length=0;
8        int maxwindow=0;
9        
10
11        for(int r=0;r<s.length();r++){
12            int max=0;
13            if(!map.containsKey(s.charAt(r))){
14                map.put(s.charAt(r),1);
15
16            }
17            else if(map.containsKey(s.charAt(r))){
18                map.put(s.charAt(r),map.get(s.charAt(r)) + 1);
19            }
20            for(int nums: map.values()){
21                if(nums>max){
22                    max=nums;
23                }
24            }
25            while(r-l+1-max>k){
26                l++;
27                 map.put(s.charAt(l-1),map.get(s.charAt(l-1))-1);
28
29            }
30            length=r-l+1;
31            if(length>maxwindow){
32                maxwindow=length;
33
34            }
35            
36
37
38
39        }
40        return maxwindow;
41        
42        
43    }
44}
45