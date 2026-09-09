class Solution {
    public int countCommas(int n) {
        int store = 0;
        if(n<999) return 0;
        for(int i=1000;i<n;i++) {
            store++;
        }
        return store+1;
    }
}