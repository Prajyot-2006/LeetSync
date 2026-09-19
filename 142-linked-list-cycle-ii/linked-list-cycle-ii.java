
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        boolean cycle = false;

        while(f != null && f.next != null) {
            s = s.next;
            f = f.next.next;

            if(s == f) {
                cycle = true;
                break;
            }
        }

        if(!cycle) return null;
        ListNode b = head;

        while(b != s) {
            b = b.next;
            s = s.next;
        }
        return b;
    }
}