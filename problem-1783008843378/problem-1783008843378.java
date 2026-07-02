// Last updated: 02/07/2026, 21:44:03
1class Solution {
2    public int trap(int[] height) {
3        int[] left=new int[height.length];
4        int[] right=new int[height.length];
5        int maxleft=0;
6        int maxright=0;
7        int area=0;
8        
9
10        for(int i=0;i<height.length;i++){
11            int current=height[i];
12            if(current>maxleft){
13                maxleft=current;
14            }
15            left[i]=maxleft;
16
17
18        }
19        for(int j=height.length-1;j>-1;j--){
20            int currentR=height[j];
21            if(currentR>maxright){
22                maxright=currentR;
23            }
24            right[j]=maxright;
25
26
27        }
28        for(int k=0;k<height.length;k++){
29            if(left[k]<right[k]){
30                area= area+left[k]-height[k];
31            }
32            else{
33                area+=right[k]-height[k];
34                
35            }
36
37
38        }  
39        return area;      
40    }
41}