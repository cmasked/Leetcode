// Last updated: 19/06/2026, 13:32:40
class Solution {
    public int[] replaceElements(int[] arr) {
        
        for(int i=0;i<arr.length-1;i++){
            int max=arr[i+1];
            
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[j+1]>max){
                    max=arr[j+1];
                }
            }
            arr[i]=max;

            
            
        }
        arr[arr.length-1]=-1;
        return arr;
        
        }

        
    }
