class Solution {
    public int[] separateDigits(int[] nums) {
        int len = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<len;i++) {
            int n = nums[i];
            int count = 0;
            while(n!=0) {
                arr.add(n%10);
                n = n/10;
                count++;
            }
            // rev
            int s=0;
            int e=arr.size()-1;
            while(s<e) {
                int temp = arr.get(s);
                arr.set(s,arr.get(e));
                arr.set(e,temp);
                s++;
                e--;
            }
            for(int a=0;a<arr.size();a++) {
                ans.add(arr.get(a));
            }
            // empty list
            for(int t=count-1;t>=0;t--) {
                arr.remove(t);
            }
        }
        int send[] = new int[ans.size()];
        for(int b=0;b<send.length;b++) {
            send[b] = ans.get(b);
        }
        return send;

    }
}