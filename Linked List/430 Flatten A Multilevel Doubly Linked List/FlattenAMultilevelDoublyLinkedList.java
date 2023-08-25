/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp = head ;
        while(temp != null) {
            Node tmp = temp.next ;
            if(temp.child != null) {
                Node curr = flatten(temp.child);
                temp.next = curr ;
                curr.prev = temp ;

                while(curr.next != null) {
                    curr = curr.next ;
                }
                curr.next = tmp ;
                if(tmp != null) tmp.prev = curr ;
            }
            temp.child = null ;
            temp = tmp ;
        }
        return head ;
    }
}