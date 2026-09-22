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
    public ListNode partition(ListNode head, int x) {
        ListNode a = new ListNode(-1);
        ListNode a1 = a;
        ListNode b = new ListNode(-1);
        ListNode b1 = b;
        ListNode temp = head;
        while(temp!=null) {
            if(temp.val<x) {
                a1.next = temp;
                a1 = a1.next;
            }
            else {
                b1.next = temp;
                b1 = b1.next;
            }
            temp = temp.next;
        }
        b1.next = null;
        a1.next = b.next;
        return a.next;
    }
}