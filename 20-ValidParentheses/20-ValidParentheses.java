// Last updated: 16/07/2026, 03:25:05
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack=new Stack<>();
4        if(s.charAt(0)=='('||s.charAt(0)=='{'||s.charAt(0)=='['){
5                stack.push(s.charAt(0));
6            }
7        else{
8            return false;
9        }
10
11        for(int i=1;i<s.length();i++){
12
13
14            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
15                stack.push(s.charAt(i));
16            }
17
18            else{
19            if (stack.isEmpty()) {
20            return false;
21            }
22            if(stack.peek()=='('&&s.charAt(i)==')'||stack.peek()=='{'&&s.charAt(i)=='}'||stack.peek()=='['&&s.charAt(i)==']'){
23                stack.pop();}
24
25            else{
26                return false;
27            }
28            
29            }
30            
31
32        }
33        return stack.isEmpty();
34        
35    }
36}