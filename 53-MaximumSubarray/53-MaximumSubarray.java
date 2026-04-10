// Last updated: 10/04/2026, 22:15:10
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int sum=0;
4        int maxsum=nums[0];
5        for(int i=0;i<nums.length;i++){
6            sum=sum+nums[i];
7            if(sum>maxsum){
8                maxsum=sum;
9
10            }
11            
12            if(sum<0){
13                sum=0;
14            }
15            
16            
17
18        }
19        return maxsum;
20    }
21}