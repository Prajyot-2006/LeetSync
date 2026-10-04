class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // reverse both lists
        ListNode p1 = null;
        ListNode f1 = null;
        ListNode c1 = l1;
        while(c1!=null) {
            f1 = c1.next;
            c1.next = p1;
            p1 = c1;
            c1 = f1;
        }

        ListNode p2 = null;
        ListNode f2 = null;
        ListNode c2 = l2;
        while(c2!=null) {
            f2 = c2.next;
            c2.next = p2;
            p2 = c2;
            c2 = f2;
        }
        int carry = 0;
        int sum = 0;
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(p1!=null && p2!=null) {
            sum = sum + p1.val + p2.val + carry;
            carry = sum / 10;
            if(sum>9) {
                sum = sum%10;
            }
            ListNode temp = new ListNode(sum);
            current.next = temp;
            current = current.next;
            sum = 0;
            p1 = p1.next;
            p2 = p2.next;
        }
        if(p2==null) {
            while(p1!=null) {
                sum = sum + p1.val + carry;
                carry = sum / 10;
                if(sum > 9) {
                    sum = sum % 10;
                }
                ListNode temp = new ListNode(sum);
                sum = 0;
                current.next = temp;
                current = current.next;
                p1 = p1.next;
            }
        }
        else {
            while(p2!=null) {
                sum = sum + p2.val + carry;
                carry = sum / 10;
                if(sum > 9) {
                    sum = sum % 10;
                }
                ListNode temp = new ListNode(sum);
                sum = 0;
                current.next = temp;
                current = current.next;
                p2 = p2.next;
            }
        }
        if(carry>0) {
            ListNode temp = new ListNode(carry);
            current.next = temp;
            current = current.next;
        }

        // now reverse the dummy
        ListNode c3 = dummy.next;
        ListNode p3 = null;
        ListNode f3 = null;
        while(c3!=null) {
            f3 = c3.next;
            c3.next = p3;
            p3 = c3;
            c3 = f3; 
        }
        return p3;

        
        
    }
}