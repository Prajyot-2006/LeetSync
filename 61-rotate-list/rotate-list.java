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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode s = head;
        ListNode f = head;
        ListNode temp = head;
        int size = 0;
        if(head==null || head.next==null) return head;
        while(temp!=null) {
            temp = temp.next;
            size++;
        }
        if(k>=size) {
            k = k%size;

        }
        if(k==0) return head;
        for(int i=1;i<=k+1;i++) {
            f = f.next;
        }
        while(f!=null) {
            s = s.next;
            f = f.next;
        }
        ListNode a = s.next;
        s.next = null;
        ListNode tail = a;
        while(tail.next!=null) {
            tail = tail.next;
        }
        tail.next = head;
        return a;
    }
}