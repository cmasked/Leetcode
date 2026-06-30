class Solution {
    public boolean isPalindrome(String s) {
        String input=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=input.length()-1;i>-1;i--){
            sb.append(input.charAt(i));
        }
        String hi=sb.toString();

        if(input.equals(hi)){
            return true;
        }

        return false;
        
        
    }
}