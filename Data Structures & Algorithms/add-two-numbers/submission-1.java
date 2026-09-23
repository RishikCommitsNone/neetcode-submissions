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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int div = 0;
        ListNode l3 = new ListNode();
        ListNode ans = l3;
        while(l1 != null || l2 != null || div != 0){
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;
            int tot = v1 + v2 + div;
            div = tot / 10;
            tot = tot % 10;
            l3.next = new ListNode(tot);
            l3 = l3.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        return ans.next;
    }
}
