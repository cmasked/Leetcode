// Last updated: 06/03/2026, 18:59:05
1class Solution {
2    public int majorityElement(int[] nums) {
3        int count=0;
4        int max=nums[0];
5        
6        for(int i=0;i<nums.length;i++){
7            
8            
9            if(count==0){
10                max=nums[i];
11            }
12             if(nums[i]==max){
13                count++;
14            }
15            else{
16                count--;
17                
18            }}
19            
20            
21       return max; 
22    }
23}