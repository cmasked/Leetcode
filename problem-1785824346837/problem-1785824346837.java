// Last updated: 04/08/2026, 11:49:06
1class Solution {
2    public int findMin(int[] nums) {
3        int count=0;
4        int division_point=0;
5        
6
7        for(int i=0;i<nums.length-1;i++){
8            if(nums[i]>nums[i+1]){
9                division_point=i+1;
10            }
11
12
13
14
15
16        }
17        return nums[division_point];
18        
19    }
20}