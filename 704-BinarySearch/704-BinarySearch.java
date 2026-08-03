// Last updated: 03/08/2026, 09:56:24
1class Solution {
2    public int search(int[] nums, int target) {
3        int l=0;
4        int r=nums.length-1;
5        
6        while(l<=r){
7            int  m=l+(r-l)/2;
8            if(nums[m]==target){
9                return m;
10            }
11            else if(nums[m]>target){
12                r=m-1;
13
14            }
15            else{
16                l=m+1;
17            }
18        }
19        return -1;
20        
21    }
22}