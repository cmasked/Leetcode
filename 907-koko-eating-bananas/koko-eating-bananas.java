class Solution {
    public int minEatingSpeed(int[] piles, int h) { 
        int ceiling=0;
        Arrays.sort(piles);
        int r=piles[piles.length-1];
        int l=1;
        int answer=r;
              
        while(l<=r){ 
            int mid=l+(r-l)/2; 
            long  hours=0; 

           for(int i=0;i<piles.length;i++){
            
            ceiling=(piles[i]+mid-1)/mid;
            hours=ceiling+hours;
        }
   
        if(hours<=h){
            answer=mid;
            r=mid-1;

        }   
        else{
            l=mid+1;
        }
        
    }
    return answer;
}
}
