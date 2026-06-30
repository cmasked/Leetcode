// Last updated: 30/06/2026, 13:13:01
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        if(nums.length==0){
4            return 0;
5        }
6        
7        int maxcount=1;
8        HashSet<Integer>set=new HashSet<>();
9        for(int i=0;i<nums.length;i++){ 
10            
11            set.add(nums[i]);
12            }
13
14        for(int num:set){ 
15            int count=1;
16            int current=num;
17            if(!set.contains(num-1)){
18                            
19            while(set.contains(current+1)){
20                current++;
21                count++;
22            }
23            }
24            if(count>maxcount){
25                maxcount=count;
26            }
27
28        }
29            
30            return maxcount;
31
32        }
33        
34}
35        
36    