// Last updated: 30/06/2026, 15:46:35
1class Solution {
2    public boolean isPalindrome(String s) {
3        int l=0;
4        int r=s.length()-1;
5
6        while(l<r){
7            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
8                l++;
9            }
10            while(r>l && !Character.isLetterOrDigit(s.charAt(r))){
11                r--;
12            }
13            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
14                return false;
15                
16            }
17            l++;
18            r--;
19        }
20        return true;
21
22        
23        
24    }
25}