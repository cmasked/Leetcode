// Last updated: 29/09/2026, 18:33:53
1class Solution {
2    public int findDuplicate(int[] nums) {
3    int fast=0;
4    int slow=0;
5
6    while(true){
7        slow=nums[slow];
8        fast=nums[nums[fast]];
9        if (slow==fast){
10            break;
11        }
12    }
13        int slow2=0;
14        while(true){
15            slow=nums[slow];
16            slow2=nums[slow2];
17            if(slow==slow2){
18                break;
19            }
20
21        }
22    
23    return slow;
24    
25    }
26}