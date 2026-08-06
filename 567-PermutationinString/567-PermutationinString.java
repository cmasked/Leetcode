// Last updated: 06/08/2026, 17:35:49
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3
4        HashMap<Character,Integer> map= new HashMap <>();
5        HashMap<Character,Integer> s1_map= new HashMap <>();
6        if (s1.length() > s2.length()) {
7            return false;
8        }
9        int l=0;
10        int r=s1.length()-1;
11        //creating permutation string in map
12         for(int j=0;j<s1.length();j++){
13            if(!s1_map.containsKey(s1.charAt(j))){
14                s1_map.put(s1.charAt(j),1);
15            }
16            else{
17                
18                s1_map.put(s1.charAt(j),s1_map.get(s1.charAt(j))+1);
19            }
20        }
21
22        // create sliding window for the main string 
23
24           
25            for(int i=0;i<s1.length();i++){
26                    
27                if(!map.containsKey(s2.charAt(i))){
28                map.put(s2.charAt(i),1);
29                }
30                else{
31                    map.put(s2.charAt(i),map.get(s2.charAt(i))+1);
32                    }
33                }
34            while(r<=s2.length()-1){
35                if(map.equals(s1_map)){
36                    return true;
37                }
38                if (r == s2.length() - 1){
39                    break;
40                }
41                 map.put(s2.charAt(l),map.get(s2.charAt(l))-1);
42                
43                if(map.get(s2.charAt(l))==0){
44                    map.remove(s2.charAt(l));
45                }                   
46                         
47                l++;
48
49                
50                r++;
51                
52
53                 if(!map.containsKey(s2.charAt(r))){
54                map.put(s2.charAt(r),1);
55                }
56                else{
57                    map.put(s2.charAt(r),map.get(s2.charAt(r))+1);
58                    }
59                }
60                return false;
61            
62                
63            }
64        }
65        
66    
67
68