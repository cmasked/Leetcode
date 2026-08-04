class Solution {
    public int removeDuplicates(int[] nums) {
        int read =0,write=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[read]){
                read++;
            }
            else{
                nums[write]=nums[i];
                read++;
                write++;
            }
        }
        return write;
                
    }
}