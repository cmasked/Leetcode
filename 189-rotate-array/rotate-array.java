class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        if (k == 0) return;

        int[] numbers = new int[k];
        int[] numbers1 = new int[n - k];

        for(int i = 0; i < n; i++){
            if(i < n - k){
                numbers1[i] = nums[i];
            } else {
                numbers[i - (n - k)] = nums[i];
            }
        }

        for(int j = 0; j < n; j++){
            if(j < k){
                nums[j] = numbers[j];
            } else {
                nums[j] = numbers1[j - k];
            }
        }
    }
}