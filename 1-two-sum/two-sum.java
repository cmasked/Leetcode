class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
            int num1=nums[i];
            int index=i;
           
            for(int j=i+1;j<nums.length;j++){
                if(num1+nums[j]==target){
                    return new int[]{index, j};
                }
            }
            
        }
       return new int[]{-1,-1};
    }
}