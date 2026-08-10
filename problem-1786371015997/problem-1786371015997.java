// Last updated: 10/08/2026, 19:40:15
1class Solution {
2    public int maxProfit(int[] prices) {
3        int l=0;
4        int r=1;
5        int maxprofit=0;
6        
7       for(int i=1;i<prices.length;i++){
8        if(prices[r]-prices[l]>maxprofit){
9            maxprofit=prices[r]-prices[l];
10        }
11        if(prices[l]>=prices[r]){
12            l=r;
13        }
14        r++;
15    }
16       
17      
18 return maxprofit;
19
20       }        
21        
22    }