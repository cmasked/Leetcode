// Last updated: 30/06/2026, 16:58:13
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3    List<List<Integer>> result = new ArrayList<>();
4        Arrays.sort(nums);
5        for(int i=0;i<nums.length;i++){
6
7            int target=nums[i];
8            int l=i+1;int r=nums.length-1;
9            if(i>0&&nums[i]==nums[i-1]){
10                    continue;
11                }
12            
13            while(l<r){
14                if(-(nums[i])==nums[l]+nums[r]){
15                    List<Integer> triplet = new ArrayList<>();
16                    triplet.add(nums[i]);
17                    triplet.add(nums[l]);
18                    triplet.add(nums[r]);
19                    result.add(triplet);
20                    while (l < r && nums[l] == nums[l + 1]) {
21                     l++;
22                    }
23                while (l < r && nums[r] == nums[r - 1]) {
24                        r--;
25                        }
26                    l++;
27                    r--;
28                     
29
30                    
31                }
32               
33                else if(-(nums[i])>nums[l]+nums[r]){
34                    l++;}
35
36            
37                else if(-(nums[i])<nums[l]+nums[r]){
38                    r--;}
39
40        }
41        
42            
43    }
44    return result;
45        
46    }}
47