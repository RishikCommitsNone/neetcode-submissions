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
    public void reorderList(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode curr = slow.next;
        ListNode prev = slow.next = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode fs = head;
        while(prev != null){
            ListNode tmp1 = fs.next;
            ListNode tmp2 = prev.next;
            fs.next = prev;
            prev.next = tmp1;
            fs = tmp1;
            prev = tmp2;
        }
    }
}
