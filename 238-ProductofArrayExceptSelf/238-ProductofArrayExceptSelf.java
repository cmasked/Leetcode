// Last updated: 10/08/2026, 19:49:04
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3       
4        int[]left=new int[nums.length];
5        int[]right=new int[nums.length];
6        left[0]=1;
7        
8        right[nums.length-1]=1;
9        
10        for(int i=1;i<nums.length;i++){
11            left[i]=left[i-1]*nums[i-1];
12        }
13        for(int j=nums.length-2;j>-1;j--){
14            right[j]=right[j+1]*nums[j+1];
15        }
16        for(int k=0;k<nums.length;k++){
17            nums[k]=left[k]*right[k];
18        }
19
20        return nums;    
21        
22    }
23}