class Solution {
    public int[] productExceptSelf(int[] nums) {
        // ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        int arr[] = new int[n];

        int prodL = 1;
        int prodR = 1;
        for(int i=n-1;i>=0;i--) {
            arr[i] = prodR;
            prodR = prodR * nums[i];
        }
        for(int i=0;i<n;i++) {
            arr[i] = arr[i] * prodL;
            prodL = prodL * nums[i];
        }

        return arr;
    }
}