// Last updated: 27/07/2026, 12:03:45
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        Stack <Integer> stack= new Stack<>();
4        int []answers =new int[temperatures.length];
5        int count=0;
6
7        for(int i=0;i<temperatures.length;i++){
8
9            
10            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
11                answers[stack.peek()]=i-stack.peek();
12                stack.pop();
13            }
14            
15
16            stack.push(i);
17
18            
19
20
21        }
22        return answers;
23
24        
25    }
26}