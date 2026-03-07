// Last updated: 07/03/2026, 23:54:22
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k = k % n;
5
6        if (k == 0) return;
7
8        int[] numbers = new int[k];
9        int[] numbers1 = new int[n - k];
10
11        for(int i = 0; i < n; i++){
12            if(i < n - k){
13                numbers1[i] = nums[i];
14            } else {
15                numbers[i - (n - k)] = nums[i];
16            }
17        }
18
19        for(int j = 0; j < n; j++){
20            if(j < k){
21                nums[j] = numbers[j];
22            } else {
23                nums[j] = numbers1[j - k];
24            }
25        }
26    }
27}