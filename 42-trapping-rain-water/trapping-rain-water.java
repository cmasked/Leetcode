class Solution {
    public int trap(int[] height) {
        int[] left=new int[height.length];
        int[] right=new int[height.length];
        int maxleft=0;
        int maxright=0;
        int area=0;
        

        for(int i=0;i<height.length;i++){
            int current=height[i];
            if(current>maxleft){
                maxleft=current;
            }
            left[i]=maxleft;


        }
        for(int j=height.length-1;j>-1;j--){
            int currentR=height[j];
            if(currentR>maxright){
                maxright=currentR;
            }
            right[j]=maxright;


        }
        for(int k=0;k<height.length;k++){
            if(left[k]<right[k]){
                area= area+left[k]-height[k];
            }
            else{
                area+=right[k]-height[k];
                
            }


        }  
        return area;      
    }
}