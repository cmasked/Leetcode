class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        
        int maxcount=1;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){ 
            
            set.add(nums[i]);
            }

        for(int num:set){ 
            int count=1;
            int current=num;
            if(!set.contains(num-1)){
                            
            while(set.contains(current+1)){
                current++;
                count++;
            }
            }
            if(count>maxcount){
                maxcount=count;
            }

        }
            
            return maxcount;

        }
        
}
        
    