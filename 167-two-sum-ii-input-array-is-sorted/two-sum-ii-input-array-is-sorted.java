class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer=new int[2];
        int l=0,r=numbers.length-1;
        while(l<r){
            if(target<numbers[l]+numbers[r]){
                r--;
            }
            else if(target>numbers[l]+numbers[r]){
                l++;
            }
            else{
                answer[0]=l+1;
                answer[1]=r+1;
                return answer;
                
            }           
        }
        return answer;        
    }
}