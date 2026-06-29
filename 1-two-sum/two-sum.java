class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[]numbers=new int[2];
    
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(target-nums[i])){
                int hi=i;
                int hi1=map.get(target-nums[i]);
                numbers[0]=hi1;
                numbers[1]=hi;

            }
            else{
                map.put(nums[i],i);
            }

            


            
        }
        
        return numbers;
        
        
    }
}