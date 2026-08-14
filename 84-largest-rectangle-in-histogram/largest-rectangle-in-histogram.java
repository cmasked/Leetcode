class Solution {
    public int largestRectangleArea(int[] heights) {
        int [] nse=new int[heights.length];
        int [] pse=new int[heights.length];
        int max=0;

        Stack<Integer> st_nse=new Stack<>();
        Stack<Integer> st_pse=new Stack<>();

        for(int i=0;i<heights.length;i++){

            while(!st_pse.isEmpty() && heights[st_pse.peek()]>=heights[i]){
                st_pse.pop();
            }
            if(st_pse.isEmpty()){
                pse[i]=-1;
            }
            else{
                pse[i]=st_pse.peek();
            }
            st_pse.push(i);

        }
        for(int j=heights.length-1;j>-1;j--){

            while(!st_nse.isEmpty() && heights[st_nse.peek()]>=heights[j]){
                st_nse.pop();
            }
            if(st_nse.isEmpty()){
                nse[j]=heights.length;
            }
            else{
                nse[j]=st_nse.peek();
            }
            st_nse.push(j);

        }

        for(int k=0;k<heights.length;k++){
            max=Math.max(max,(heights[k]*(nse[k]-pse[k]-1))); 
        }
        return max;
        
    }
}