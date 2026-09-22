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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode test = head;

        int size = 0;

        while(test != null){
            size++;
            test = test.next;
        }
        int index = size - n;

        ListNode test2 = head;

        if(index == 0){
            return head.next;
        }

        for(int i = 0; i < size - 1; i++){
            if((i + 1) == index){
                test2.next = test2.next.next;
                break;
            }
            test2 = test2.next;
        }

        return head;
    }
}
