class Solution {
    public int maxProduct(int[] nums) {
        
        
        int oldmax=nums[0];
        int oldmin=nums[0];
        int newmax=nums[0];
        int newmin=nums[0];
        int answer=nums[0];
        int max=nums[0];
        int min=nums[0];

        for(int i=1;i<nums.length;i++){
            
            max=Math.max(nums[i],Math.max(oldmax*nums[i],oldmin*nums[i]));
            min=Math.min(nums[i],Math.min(oldmax*nums[i],newmin*nums[i]));
            newmax=max;
            newmin=min;
            answer=Math.max(answer,newmax);
            oldmax=max;
            oldmin=min;
            
            

        }
        return answer;

    }}
      