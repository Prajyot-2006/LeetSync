class Solution {
    public int smallestIndex(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            int n = arr[i];
            int sum = 0;
            while(n!=0) {
                sum = sum + n%10;
                n = n/10;
            }
            if(sum==i) return i;
        }
        return -1;
    }
}