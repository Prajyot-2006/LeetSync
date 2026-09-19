public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int size1 = 0;
        int size2 = 0;
        while(temp1!=null) {
            size1++;
            temp1 = temp1.next;
        }

        while(temp2!=null) {
            size2++;
            temp2 = temp2.next;
        }
        int diff = 0;
        if(size1>size2) {  // 1st LL bada
            diff = size1 - size2;
            for(int i=1;i<=diff;i++) {
                headA = headA.next;
            }
        }
        else {  // 2nd LL bada
            diff = size2 - size1;
            for(int i=1;i<=diff;i++) {
                headB = headB.next;
            }
        }
        while(headA!=headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}