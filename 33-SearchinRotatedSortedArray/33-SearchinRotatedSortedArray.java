// Last updated: 05/08/2026, 23:47:30
1class Solution {
2    public int search(int[] nums, int target) {
3        int l=0;
4        int r=nums.length-1;
5        int pivot=-1;
6        int mid=l+(r-l)/2;
7        
8        while(l<=r){
9            mid=l+(r-l)/2;
10            if (nums[mid] == target){
11            return mid;
12            }
13            if(nums[l]<=nums[mid]){
14                if(nums[l]<=target && nums[mid]>target){
15                    r=mid-1;
16                }
17                else{
18                    l=mid+1;
19                }
20            }
21            else {
22                if(nums[mid]<target && nums[r]>=target ){
23                    l=mid+1;
24                }
25                else{
26                    r=mid-1;
27                }
28            }
29        }
30            
31        return -1;
32        
33    }
34}
35