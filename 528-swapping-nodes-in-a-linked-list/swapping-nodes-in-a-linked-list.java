class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int size = 0;
        while(temp!=null) {
            temp = temp.next;
            size++;
        }
        int k1 = size - k + 1;
        ListNode t1 = head;
        ListNode t2 = head;
        for(int i=1;i<k;i++) {
            t1 = t1.next;
        }
        for(int i=1;i<k1;i++) {
            t2 = t2.next;
        }
        int store = t1.val;
        t1.val = t2.val;
        t2.val = store;
        return head;
    }
}