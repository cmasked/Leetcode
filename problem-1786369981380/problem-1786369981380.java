// Last updated: 10/08/2026, 19:23:01
1class Solution {
2    public int maxProfit(int[] prices) {
3        int min=prices[0];
4        int maxprofit=0;
5        
6       for(int i=1;i<prices.length;i++){
7        if(prices[i]<min){
8            min=prices[i];
9        
10        }
11        if(prices[i]-min>maxprofit){
12        maxprofit=prices[i]-min;
13        }}
14       
15      
16 return maxprofit;
17
18       }        
19        
20    }
21