class Solution {
    public int findDuplicate(int[] nums) {
    HashSet <Integer> set=new HashSet<>();
    int answer=0;

    for(int i=0;i<nums.length;i++){
        if(!set.contains(nums[i])){
            set.add(nums[i]);
        }
        else{
            answer=nums[i];
            break;
            

        }
    }
    return answer;
        
    }
}