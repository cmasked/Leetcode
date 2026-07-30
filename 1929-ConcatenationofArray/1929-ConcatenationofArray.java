// Last updated: 30/07/2026, 09:22:24
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int[] answer= new int[2*nums.length];
4        for(int i=0;i<nums.length;i++){
5            answer[i]=nums[i];
6            answer[i+nums.length]=nums[i];
7        }
8        return answer;
9        
10        
11    }
12}