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
    public boolean isPalindrome(ListNode head) {
/* arraylist approach - 2 pointers
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null) {
            arr.add(temp.val);
            temp = temp.next;
        }
        int n = arr.size();
        int i=0;
        int j=n-1;
        while(i<j) {
            if(arr.get(i)!=arr.get(j)) return false;
            i++;
            j--;
        }
        return true;
*/
        ListNode s = head;
        ListNode f = head;

        while(f.next!=null && f.next.next!=null) {
            s = s.next;
            f = f.next.next;
        }
        
        // now break the LL before s and reverse the list from s
        ListNode p = null;
        ListNode fwd = null;
        ListNode c = s;
        while(c!=null) {
            fwd = c.next;
            c.next = p;
            p = c;
            c = fwd;
        }
        ListNode temp1 = head;
        ListNode temp2 = p;
        while(temp1!=null && temp2!=null) {
            if(temp1.val!=temp2.val) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;

    }
}