class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int maxprofit=0;
        
       for(int i=1;i<prices.length;i++){
        if(prices[r]-prices[l]>maxprofit){
            maxprofit=prices[r]-prices[l];
        }
        if(prices[l]>=prices[r]){
            l=r;
        }
        r++;
    }
       
      
 return maxprofit;

       }        
        
    }