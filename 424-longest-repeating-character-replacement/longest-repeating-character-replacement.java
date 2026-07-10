class Solution {
    public int characterReplacement(String s, int k) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        
        int l=0;
        int length=0;
        int maxwindow=0;
        

        for(int r=0;r<s.length();r++){
            int max=0;
            if(!map.containsKey(s.charAt(r))){
                map.put(s.charAt(r),1);

            }
            else if(map.containsKey(s.charAt(r))){
                map.put(s.charAt(r),map.get(s.charAt(r)) + 1);
            }
            for(int nums: map.values()){
                if(nums>max){
                    max=nums;
                }
            }
            while(r-l+1-max>k){
                l++;
                 map.put(s.charAt(l-1),map.get(s.charAt(l-1))-1);

            }
            length=r-l+1;
            if(length>maxwindow){
                maxwindow=length;

            }
            



        }
        return maxwindow;
        
        
    }
}
