// Last updated: 29/06/2026, 17:05:17
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        int[]numbers=new int[2];
5    
6        for(int i=0;i<nums.length;i++){
7            
8            if(map.containsKey(target-nums[i])){
9                int hi=i;
10                int hi1=map.get(target-nums[i]);
11                numbers[0]=hi1;
12                numbers[1]=hi;
13
14            }
15            else{
16                map.put(nums[i],i);
17            }
18
19            
20
21
22            
23        }
24        
25        return numbers;
26        
27        
28    }
29}