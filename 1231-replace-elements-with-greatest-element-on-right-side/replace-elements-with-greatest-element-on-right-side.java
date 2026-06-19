class Solution {
    public int[] replaceElements(int[] arr) {
        int maxright=arr[arr.length-1];
              
        for(int i=arr.length-2;i>-1;i--){
            int current=arr[i];
             
            arr[i]=maxright;        
            if(current>maxright){
                maxright=current;
                

            }
        }
        arr[arr.length-1]=-1;
        return arr;
        }

        
    }
