class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> arrEven = new ArrayList<>();
        ArrayList<Integer> arrOdd = new ArrayList<>();
        for(int i=0;i<n;i++) {
            if(arr[i]%2==0) {
                arrEven.add(arr[i]);
            }
            else {
                arrOdd.add(arr[i]);
            }
        }
        for(int i=0;i<arrEven.size();i++) {
            arr[i] = arrEven.get(i);
        }
        int j = arrEven.size();
        for(int i=0;i<arrOdd.size();i++) {
            arr[j] = arrOdd.get(i);
            j++;
        }
        return arr;
    }
}