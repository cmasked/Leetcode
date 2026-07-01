// Last updated: 01/07/2026, 16:08:55
1class Solution {
2    public int maxArea(int[] height) {
3        int l=0;
4        int r=height.length-1;
5        int area=0;
6        int maxarea=0;
7
8        
9            while(l<r){
10                if(height[l]<height[r]){
11                    area=(r-l)*height[l];
12                    l++;
13
14                }
15                else{
16                    area=(r-l)*height[r];
17                    r--;
18
19                }
20                if(area>maxarea){
21                    maxarea=area;
22                }
23                area=0;
24                
25                
26            }
27            
28
29        
30        return maxarea;
31        
32    }
33}