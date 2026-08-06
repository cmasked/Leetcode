// Last updated: 06/08/2026, 18:54:54
1class MinStack {
2    Stack<Integer> stack;
3    Stack<Integer> minStack;
4    
5
6    public MinStack() {
7        stack =new Stack<>();
8        minStack=new Stack<>(); 
9    }
10    
11    public void push(int val) {
12        stack.push(val);
13        if (minStack.isEmpty()) {
14            minStack.push(val);
15        } 
16        else {
17            minStack.push(Math.min(val, minStack.peek()));
18        }   
19    }
20    
21    public void pop() {
22        stack.pop();
23        minStack.pop();
24        
25        
26    }
27    
28    public int top() {
29        stack.peek();
30        
31        return stack.peek();
32        
33    }
34    
35    public int getMin() {
36        
37        return minStack.peek();
38        
39    }
40}
41