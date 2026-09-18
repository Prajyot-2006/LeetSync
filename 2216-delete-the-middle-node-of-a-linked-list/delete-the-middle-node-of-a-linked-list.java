/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        ListNode s = head;
        ListNode f = head;
        while(f!=null && f.next!=null) {
            temp = s;
            s = s.next;
            f = f.next.next;
        }
        if(temp.next==null) return null;
        temp.next = s.next;
        return head;
    }
}