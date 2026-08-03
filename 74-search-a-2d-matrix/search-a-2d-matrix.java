class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
        int r=matrix.length-1;

        while(l<=r){
            int m=l+(r-l)/2;
            if(matrix[m][0]<=target && target<=matrix[m][matrix[0].length - 1]){
                int left=0;
                int right = matrix[0].length - 1;
                while(left<=right){
                    int mid = left + (right - left) / 2;
                    if(matrix[m][mid]==target){
                        return true;
                    }
                    else if(matrix[m][mid]>target){
                        right=mid-1;
                    }
                    else{
                        left=mid+1;
                    }
                }
                return false;
            }
            
            else if(target<matrix[m][0]){
                r=m-1;

            }
            else{
                l=m+1;
            }

        }
        return false;

        
        
    }
}
