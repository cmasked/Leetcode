// Last updated: 10/08/2026, 19:48:35
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3
4        HashSet<Integer> map= new HashSet<>();
5        for(int i=0;i<nums.length;i++){
6            if(map.contains(nums[i])){
7                return true;
8            }
9            map.add(nums[i]);
10            
11        }
12        return false;
13    }
14}