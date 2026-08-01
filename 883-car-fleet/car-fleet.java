class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int fleet=0;
        Stack<int[]> s=new Stack<>();
        int[][] cars = new int[position.length][2];
        for(int i = 0; i < position.length; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars,(a,b) -> Integer.compare(a[0],b[0]));
        for(int j=cars.length-1;j>-1;j--){
            if(s.isEmpty()){
                s.push(cars[j]);
                continue;
            }
            int[] temp=s.peek();
            int position_peak=temp[0];            
            int speed_peak=temp[1];
            double time_peak=(double)(target-position_peak)/speed_peak;
            if(!s.isEmpty()){
                s.push(cars[j]);
                
            }
            temp=s.peek();
            int position_push=temp[0];            
            int speed_push=temp[1];
            double time_push=(double)(target-position_push)/speed_push;
            if(time_push<=time_peak){
                s.pop();
                fleet++;

            }


        }
        return s.size();


        
    }
}