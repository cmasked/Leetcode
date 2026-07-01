class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int area=0;
        int maxarea=0;

        
            while(l<r){
                if(height[l]<height[r]){
                    area=(r-l)*height[l];
                    l++;

                }
                else{
                    area=(r-l)*height[r];
                    r--;

                }
                if(area>maxarea){
                    maxarea=area;
                }
                area=0;
                
                
            }
            

        
        return maxarea;
        
    }
}