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

        l1 = head;

        while(l1 != null){
            if(l1.random != null){
                l1.next.random = l1.random.next;
            }
            
            l1 = l1.next.next;
        }

        l1 = head;
        Node ans = head.next;
        while(l1 != null){
            Node temp = l1.next;
            l1.next = temp.next;
            if(temp.next != null){
                temp.next = l1.next.next;
            }
            
            l1 = l1.next;
        }
        return ans;
    }
}
