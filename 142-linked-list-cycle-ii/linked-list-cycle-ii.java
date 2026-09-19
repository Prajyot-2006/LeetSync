
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while(f!=null && f.next!=null) {
            s = s.next;
            f = f.next.next;
            if(s==f) {
                ListNode b = head;
                while (b != s) {
                    b = b.next;
                    s = s.next;
                }
                return b;
            }
        }
        return null;
    }
}