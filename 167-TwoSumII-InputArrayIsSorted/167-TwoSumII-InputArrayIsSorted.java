// Last updated: 30/06/2026, 16:01:06
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int[] answer=new int[2];
4        int l=0,r=numbers.length-1;
5        while(l<r){
6            if(target<numbers[l]+numbers[r]){
7                r--;
8            }
9            else if(target>numbers[l]+numbers[r]){
10                l++;
11            }
12            else{
13                answer[0]=l+1;
14                answer[1]=r+1;
15                return answer;
16                
17            }           
18        }
19        return answer;        
20    }
21}