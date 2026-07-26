// Last updated: 26/07/2026, 15:28:34
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> stack=new Stack<>();
4        int total=0;
5        for(int i=0;i<tokens.length;i++){
6            if(tokens.length==1){
7                total=Integer.parseInt(tokens[i]);
8            }
9            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("/") && !tokens[i].equals("*")   ){
10                stack.push(Integer.parseInt(tokens[i]));
11                            }
12            else{
13                int b=stack.pop();
14                int a=stack.pop();
15
16                if(tokens[i].equals("+")){
17                    total=a+b;
18                    stack.push(total);
19                }
20                if(tokens[i].equals("-")){
21                    total=a-b;
22                    stack.push(total);
23                }
24                if(tokens[i].equals("/")){
25                    total=a/b;
26                    stack.push(total);
27                }
28                if(tokens[i].equals("*")){
29                    total=a*b;
30                    stack.push(total);
31                }
32            }
33
34        }
35        return total;
36        
37    }
38}