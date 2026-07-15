class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        if(s.charAt(0)=='('||s.charAt(0)=='{'||s.charAt(0)=='['){
                stack.push(s.charAt(0));
            }
        else{
            return false;
        }

        for(int i=1;i<s.length();i++){


            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }

            else{
            if (stack.isEmpty()) {
            return false;
            }
            if(stack.peek()=='('&&s.charAt(i)==')'||stack.peek()=='{'&&s.charAt(i)=='}'||stack.peek()=='['&&s.charAt(i)==']'){
                stack.pop();}

            else{
                return false;
            }
            
            }
            

        }
        return stack.isEmpty();
        
    }
}