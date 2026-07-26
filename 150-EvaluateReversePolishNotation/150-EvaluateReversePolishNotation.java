// Last updated: 26/07/2026, 15:30:58
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> stack=new Stack<>();
4        int total=0;
5        for(int i=0;i<tokens.length;i++){
6            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("/") && !tokens[i].equals("*")   ){
7                stack.push(Integer.parseInt(tokens[i]));
8                            }
9            else{
10                int b=stack.pop();
11                int a=stack.pop();
12
13                if(tokens[i].equals("+")){
14                    total=a+b;
15                    stack.push(total);
16                }
17                else if(tokens[i].equals("-")){
18                    total=a-b;
19                    stack.push(total);
20                }
21                else if(tokens[i].equals("/")){
22                    total=a/b;
23                    stack.push(total);
24                }
25                else{
26                    total=a*b;
27                    stack.push(total);
28                }
29            }
30
31        }
32            return stack.pop();
33        
34    }
35}