// Last updated: 30/06/2026, 15:12:04
1class Solution {
2    public boolean isPalindrome(String s) {
3        String input=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
4        StringBuilder sb = new StringBuilder();
5        for(int i=input.length()-1;i>-1;i--){
6            sb.append(input.charAt(i));
7        }
8        String hi=sb.toString();
9
10        if(input.equals(hi)){
11            return true;
12        }
13
14        return false;
15        
16        
17    }
18}