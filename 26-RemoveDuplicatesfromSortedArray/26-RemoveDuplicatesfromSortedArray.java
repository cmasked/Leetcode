// Last updated: 04/08/2026, 11:04:21
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int read =0,write=1;
4
5        for(int i=1;i<nums.length;i++){
6            if(nums[i]==nums[read]){
7                read++;
8            }
9            else{
10                nums[write]=nums[i];
11                read++;
12                write++;
13            }
14        }
15        return write;
16                
17    }
18}