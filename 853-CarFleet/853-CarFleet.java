// Last updated: 02/08/2026, 00:14:09
1class Solution {
2    public int carFleet(int target, int[] position, int[] speed) {
3        int fleet=0;
4        Stack<int[]> s=new Stack<>();
5        int[][] cars = new int[position.length][2];
6        for(int i = 0; i < position.length; i++){
7            cars[i][0] = position[i];
8            cars[i][1] = speed[i];
9        }
10        Arrays.sort(cars,(a,b) -> Integer.compare(a[0],b[0]));
11        for(int j=cars.length-1;j>-1;j--){
12            if(s.isEmpty()){
13                s.push(cars[j]);
14                continue;
15            }
16            int[] temp=s.peek();
17            int position_peak=temp[0];            
18            int speed_peak=temp[1];
19            double time_peak=(double)(target-position_peak)/speed_peak;
20            if(!s.isEmpty()){
21                s.push(cars[j]);
22                
23            }
24            temp=s.peek();
25            int position_push=temp[0];            
26            int speed_push=temp[1];
27            double time_push=(double)(target-position_push)/speed_push;
28            if(time_push<=time_peak){
29                s.pop();
30                fleet++;
31
32            }
33
34
35        }
36        return s.size();
37
38
39        
40    }
41}