// Last updated: 14/08/2026, 19:45:55
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        int [] nse=new int[heights.length];
4        int [] pse=new int[heights.length];
5        int max=0;
6
7        Stack<Integer> st_nse=new Stack<>();
8        Stack<Integer> st_pse=new Stack<>();
9
10        for(int i=0;i<heights.length;i++){
11
12            while(!st_pse.isEmpty() && heights[st_pse.peek()]>=heights[i]){
13                st_pse.pop();
14            }
15            if(st_pse.isEmpty()){
16                pse[i]=-1;
17            }
18            else{
19                pse[i]=st_pse.peek();
20            }
21            st_pse.push(i);
22
23        }
24        for(int j=heights.length-1;j>-1;j--){
25
26            while(!st_nse.isEmpty() && heights[st_nse.peek()]>=heights[j]){
27                st_nse.pop();
28            }
29            if(st_nse.isEmpty()){
30                nse[j]=heights.length;
31            }
32            else{
33                nse[j]=st_nse.peek();
34            }
35            st_nse.push(j);
36
37        }
38
39        for(int k=0;k<heights.length;k++){
40            max=Math.max(max,(heights[k]*(nse[k]-pse[k]-1))); 
41        }
42        return max;
43        
44    }
45}