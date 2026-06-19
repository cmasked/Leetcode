// Last updated: 19/06/2026, 13:28:40
1class Solution {
2    public int[] replaceElements(int[] arr) {
3        
4        for(int i=0;i<arr.length-1;i++){
5            int max=arr[i+1];
6            
7            for(int j=i+1;j<arr.length-1;j++){
8                if(arr[j+1]>max){
9                    max=arr[j+1];
10                }
11            }
12            arr[i]=max;
13
14            
15            
16        }
17        arr[arr.length-1]=-1;
18        return arr;
19        
20        }
21
22        
23    }
24