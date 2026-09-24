class Solution {
    public int pairSum(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while(f.next!=null && f.next.next!=null) {
            s = s.next;
            f = f.next.next;
        }
        ListNode p = null;
        ListNode fwd = null;
        ListNode c = s;
        while(c!=null) {
            fwd = c.next;
            c.next = p;
            p = c;
            c = fwd;
        }
        // now head and p do comparision 
        ListNode temp = head;
        int max = -1110202;
        while(temp!=null) {
            if(temp.val + p.val > max) {
                max = temp.val + p.val;
            }
            temp = temp.next;
            p = p.next;
        }
        return max;

    }
}