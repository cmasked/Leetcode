// Last updated: 12/08/2026, 23:59:20
1class Solution {
2    public int maxProduct(int[] nums) {
3        
4        
5        int oldmax=nums[0];
6        int oldmin=nums[0];
7        
8        int answer=nums[0];
9        int max=nums[0];
10        int min=nums[0];
11
12        for(int i=1;i<nums.length;i++){
13            
14            max=Math.max(nums[i],Math.max(oldmax*nums[i],oldmin*nums[i]));
15            min=Math.min(nums[i],Math.min(oldmax*nums[i],oldmin*nums[i]));
16            answer=Math.max(answer,max);
17            oldmax=max;
18            oldmin=min;
19            
20            
21
22        }
23        return answer;
24
25    }}
26      