// Last updated: 30/07/2026, 09:33:03
1class Solution {
2    public int[] runningSum(int[] nums) {
3        int sum=0;
4        for(int i=0;i<nums.length;i++){
5            sum=sum+nums[i];
6            nums[i]=sum;
7
8            
9
10        }
11        return nums;
12        
13    }
14}