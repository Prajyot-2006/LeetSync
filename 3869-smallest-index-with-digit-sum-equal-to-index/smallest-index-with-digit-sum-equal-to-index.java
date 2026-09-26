class Solution {
    public int smallestIndex(int[] arr) {
        int len = arr.length;
        for(int i=0;i<len;i++) {
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