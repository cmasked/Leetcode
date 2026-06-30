class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){

            int target=nums[i];
            int l=i+1;int r=nums.length-1;
            if(i>0&&nums[i]==nums[i-1]){
                    continue;
                }
            
            while(l<r){
                if(-(nums[i])==nums[l]+nums[r]){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[l]);
                    triplet.add(nums[r]);
                    result.add(triplet);
                    while (l < r && nums[l] == nums[l + 1]) {
                     l++;
                    }
                while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                        }
                    l++;
                    r--;
                     

                    
                }
               
                else if(-(nums[i])>nums[l]+nums[r]){
                    l++;}

            
                else if(-(nums[i])<nums[l]+nums[r]){
                    r--;}

        }
        
            
    }
    return result;
        
    }}
