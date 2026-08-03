// Last updated: 03/08/2026, 11:01:18
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int l=0;
4        int r=matrix.length-1;
5
6        while(l<=r){
7            int m=l+(r-l)/2;
8            if(matrix[m][0]<=target && target<=matrix[m][matrix[0].length - 1]){
9                int left=0;
10                int right = matrix[0].length - 1;
11                while(left<=right){
12                    int mid = left + (right - left) / 2;
13                    if(matrix[m][mid]==target){
14                        return true;
15                    }
16                    else if(matrix[m][mid]>target){
17                        right=mid-1;
18                    }
19                    else{
20                        left=mid+1;
21                    }
22                }
23                return false;
24            }
25            
26            else if(target<matrix[m][0]){
27                r=m-1;
28
29            }
30            else{
31                l=m+1;
32            }
33
34        }
35        return false;
36
37        
38        
39    }
40}
41