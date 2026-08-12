// Last updated: 12/08/2026, 23:34:39
1class Solution {
2    public int maxProduct(int[] nums) {
3        
4        
5        int oldmax=nums[0];
6        int oldmin=nums[0];
7        int newmax=nums[0];
8        int newmin=nums[0];
9        int answer=nums[0];
10        int max=nums[0];
11        int min=nums[0];
12
13        for(int i=1;i<nums.length;i++){
14            
15            max=Math.max(nums[i],Math.max(oldmax*nums[i],oldmin*nums[i]));
16            min=Math.min(nums[i],Math.min(oldmax*nums[i],newmin*nums[i]));
17            newmax=max;
18            newmin=min;
19            answer=Math.max(answer,newmax);
20            oldmax=max;
21            oldmin=min;
22            
23            
24
25        }
26        return answer;
27
28    }}
29      