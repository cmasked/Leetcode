// Last updated: 21/09/2026, 19:56:52
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int l=0;
4        int r=numbers.length-1 ;
5        int [] arr=new int[2];
6            for(int i=0;i<numbers.length;i++){
7                if(numbers[l]+numbers[r]==target){
8                    arr[0]=l+1;
9                    arr[1]=r+1;
10
11                }
12                else if(numbers[l]+numbers[r]>target){
13                    r--;
14
15                }
16                else{
17                    l++;
18                }
19
20        }
21        return arr;
22        
23    }
24}