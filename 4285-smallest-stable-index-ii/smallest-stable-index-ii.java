class Solution {
    public int firstStableIndex(int[] arr, int k) {
	    int store = arr[0];
	    
        int n = arr.length;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        int i=0;
        while(i<n) {
            if(arr[i]>store) {
                store = arr[i];
            }
            arr1.add(store);
            i++;
        }
        // System.out.println(arr1);
      
        for(int x=0;x<n;x++) {
            arr2.add(0);
        }

        int store1 = arr[n - 1];
        int j = n-1;
        while(j>=0){
            if(arr[j]<store1) {
                store1 = arr[j];
            }
            arr2.set(j,store1);
            j--;
        }
        // System.out.println(arr2);
        for(int s=0;s<arr.length;s++) {
            int min = arr1.get(s) - arr2.get(s);
            if(min<=k) return s;
        }
        return -1;
    } // 5 1 4
}