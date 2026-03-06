// Last updated: 06/03/2026, 17:47:46
1class Solution {
2    public void sortColors(int[] nums) {
3        int count0=0;
4        int count1=0;
5        int count2=0; 
6        for(int i=0;i<nums.length;i++){
7            if(nums[i]==0){
8                count0++;
9            }
10            else if(nums[i]==1){
11                count1++;
12            }
13            else{
14                count2++;
15            }}
16        for(int j=0;j<nums.length;j++){
17            if(count0>0){
18                nums[j]=0;
19                count0--;
20            }
21                else if(count1>0){
22                     nums[j]=1;
23                    count1--;
24            }
25                else if(count2>0){
26                    
27                nums[j]=2;
28                count2--;
29            }
30                
31        } 
32            
33        
34        
35    }
36}