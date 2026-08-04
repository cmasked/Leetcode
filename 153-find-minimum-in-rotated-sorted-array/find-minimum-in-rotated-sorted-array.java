class Solution {
    public int findMin(int[] nums) {
        int count=0;
        int division_point=0;
        

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                division_point=i+1;
            }





        }
        return nums[division_point];
        
    }
}