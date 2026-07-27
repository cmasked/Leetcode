class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack <Integer> stack= new Stack<>();
        int []answers =new int[temperatures.length];
        int count=0;

        for(int i=0;i<temperatures.length;i++){

            
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                answers[stack.peek()]=i-stack.peek();
                stack.pop();
            }
            

            stack.push(i);

            


        }
        return answers;

        
    }
}