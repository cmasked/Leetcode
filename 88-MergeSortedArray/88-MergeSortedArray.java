// Last updated: 14/08/2026, 21:39:00
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int pointer1=m-1;
4        int pointer2=nums2.length-1;
5        int i=nums1.length-1;
6
7        while(pointer1 > -1 && pointer2 >-1){
8            
9
10            if(nums1[pointer1]>nums2[pointer2]){
11                nums1[i]=nums1[pointer1];
12                pointer1--;
13            }
14            else{
15                nums1[i]=nums2[pointer2];
16                pointer2--;
17            }
18            i--;
19
20        }
21        while(pointer2 > -1){
22            nums1[i] = nums2[pointer2];
23            pointer2--;
24            i--;
25}
26        }
27
28        
29    }
30