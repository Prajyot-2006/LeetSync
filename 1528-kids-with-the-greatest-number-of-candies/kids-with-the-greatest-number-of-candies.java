class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int ec) {
        int n = candies.length;
        ArrayList<Boolean> arr = new ArrayList<>();
        int max = -190293820;
        for(int i=0;i<n;i++) {
            if(candies[i]>max) {
                max = candies[i];
            }
        }
        for(int i=0;i<n;i++) {
            if((candies[i] + ec) >= max) {
                arr.add(true);
            }
            else {
                arr.add(false);
            }
        }
        return arr;
    }
}