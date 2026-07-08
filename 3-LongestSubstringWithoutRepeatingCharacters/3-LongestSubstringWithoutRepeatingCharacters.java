// Last updated: 08/07/2026, 21:09:04
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int length=0;
4        int max=0;
5        HashMap <Character,Integer> map=new HashMap<>();
6        int l=0;
7        for(int r=0;r<s.length();r++){                      
8            while(map.containsKey(s.charAt(r))){
9                l++;
10                map.remove(s.charAt(l-1));
11            }
12            if(!map.containsKey(s.charAt(r))){
13            map.put(s.charAt(r),r);
14            }
15            length=r-l+1;
16            if(length>max){
17                    max=length;
18                }
19            
20
21            
22           
23        }
24        return max;
25        
26    }
27}
28