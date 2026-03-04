// Last updated: 05/03/2026, 01:46:24
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        
4        for(int i=0;i<nums.length;i++){
5            int num1=nums[i];
6            int index=i;
7           
8            for(int j=i+1;j<nums.length;j++){
9                if(num1+nums[j]==target){
10                    return new int[]{index, j};
11                }
12            }
13            
14        }
15       return new int[]{-1,-1};
16    }
17}