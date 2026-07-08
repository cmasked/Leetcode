class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=0;
        int max=0;
        HashMap <Character,Integer> map=new HashMap<>();
        int l=0;
        for(int r=0;r<s.length();r++){                      
            while(map.containsKey(s.charAt(r))){
                l++;
                map.remove(s.charAt(l-1));
            }
            if(!map.containsKey(s.charAt(r))){
            map.put(s.charAt(r),r);
            }
            length=r-l+1;
            if(length>max){
                    max=length;
                }
            

            
           
        }
        return max;
        
    }
}
