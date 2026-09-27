// Last updated: 27/09/2026, 15:25:52
1class Solution {
2    public int findDuplicate(int[] nums) {
3    HashSet <Integer> set=new HashSet<>();
4    int answer=0;
5
6    for(int i=0;i<nums.length;i++){
7        if(!set.contains(nums[i])){
8            set.add(nums[i]);
9        }
10        else{
11            answer=nums[i];
12            break;
13            
14
15        }
16    }
17    return answer;
18        
19    }
20}