/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }

        Node l1 = head;
        while(l1 != null){
            Node l3 = new Node(l1.val);
            l3.next = l1.next;
            l1.next = l3;
            l1 = l1.next.next;
        }

        Node l2 = head;

        while(l2 != null){
            if(l2.random != null){
                l2.next.random = l2.random.next;
            }
            
            l2 = l2.next.next;
        }

        l1 = head;
        Node ans = head.next;
        while(l1 != null){
            Node temp = l1.next;
            l1.next = l1.next.next;
            if(temp.next != null){
                temp.next = l1.next.next;
            }
            
            l1 = l1.next;
        }
        return ans;
    }
}
