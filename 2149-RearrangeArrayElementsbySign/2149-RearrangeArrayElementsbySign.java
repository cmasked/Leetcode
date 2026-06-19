// Last updated: 19/06/2026, 15:50:40
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int pos=0;
4        int neg=1;
5        int[] ans = new int[nums.length];
6        for(int i=0;i<nums.length;i++){
7            
8            if(nums[i]>0){
9                ans[pos]=nums[i];
10                pos=pos+2;
11            }
12            if(nums[i]<0){
13                ans[neg]=nums[i];
14                neg=neg+2;
15            }
16
17        
18    }
19    return ans;
20}}