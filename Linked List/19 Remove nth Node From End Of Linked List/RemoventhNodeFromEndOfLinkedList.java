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
        int len = getListLength(head);
        ListNode temp = head;
        if(n == len)    return head.next ;
        int toRemove = len - n;
        for(int i = 1; i < len; i++) {
            if(i == toRemove) {
                if(i == len - 1)
                    temp.next = null ;
                else
                    temp.next = temp.next.next ;
                break ;
            } else {
                temp = temp.next ;
            }
        }
        return head ;
    }

    int getListLength(ListNode head) {
        if(head == null)    return 0 ;
        return 1 + getListLength(head.next);
    }
}