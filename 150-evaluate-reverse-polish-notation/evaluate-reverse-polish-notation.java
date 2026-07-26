class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int total=0;
        for(int i=0;i<tokens.length;i++){
            if(tokens.length==1){
                total=Integer.parseInt(tokens[i]);
            }
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("/") && !tokens[i].equals("*")   ){
                stack.push(Integer.parseInt(tokens[i]));
                            }
            else{
                int b=stack.pop();
                int a=stack.pop();

                if(tokens[i].equals("+")){
                    total=a+b;
                    stack.push(total);
                }
                if(tokens[i].equals("-")){
                    total=a-b;
                    stack.push(total);
                }
                if(tokens[i].equals("/")){
                    total=a/b;
                    stack.push(total);
                }
                if(tokens[i].equals("*")){
                    total=a*b;
                    stack.push(total);
                }
            }

        }
        return total;
        
    }
}