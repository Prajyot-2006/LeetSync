public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while(f!=null && f.next!=null) {
            if(s.next==null) return false;
            s = s.next;
            f = f.next.next;
            if(f==s) return true;
        } 
        return false;
    }
}