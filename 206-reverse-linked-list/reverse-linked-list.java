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
    public ListNode reverseList(ListNode head) {
        /*
        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null) {
            arr.add(temp);
            temp = temp.next;
        }
        int n = arr.size();
        for(int i=n-1;i>0;i--) {
            ListNode t1 = arr.get(i);
            ListNode t2 = arr.get(i-1);
            t1.next = t2;
        }
        if(head==null || head.next==null) return head;
        arr.get(0).next = null;
        return arr.get(n-1);
        */
        ListNode f = null;
        ListNode c = head;
        ListNode p = null;
        while(c!=null) {
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        return p;
        
    }
}