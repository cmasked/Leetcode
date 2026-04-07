// Last updated: 08/04/2026, 00:00:22
class Solution {
    public boolean isPalindrome(String s) {
        String noSpaces = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String hi="";
        for(int i=noSpaces.length()-1;i>-1;i--){
            hi=hi+noSpaces.charAt(i);
        } 
          if(noSpaces.equals(hi)){
        return true;
    }
    else{
        return false;
    }      
    }
  
}