class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i] , map.get(nums[i])+1);
            }
            else {
                map.put(nums[i] , 1);
            }
        }
        for(int key : map.keySet()) {
            if(map.get(key)==3) {
                arr.add(key);
            }
        }
        int send = 0;

        for(int ele : arr) {
            ArrayList<Integer> index = new ArrayList<>();
            for(int i=0;i<n;i++) {
                if(nums[i]==ele) {
                    index.add(i);
                }
            }
            if(index.get(1)-index.get(0) == index.get(2)-index.get(1)) {
                send++;
            }
        }
        return send;


        

    }
}