// Last updated: 03/08/2026, 21:38:53
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) { 
3        int ceiling=0;
4        Arrays.sort(piles);
5        int r=piles[piles.length-1];
6        int l=1;
7        int answer=r;
8              
9        while(l<=r){ 
10            int mid=l+(r-l)/2; 
11            long  hours=0; 
12
13           for(int i=0;i<piles.length;i++){
14            
15            ceiling=(piles[i]+mid-1)/mid;
16            hours=ceiling+hours;
17        }
18   
19        if(hours<=h){
20            answer=mid;
21            r=mid-1;
22
23        }   
24        else{
25            l=mid+1;
26        }
27        
28    }
29    return answer;
30}
31}
32