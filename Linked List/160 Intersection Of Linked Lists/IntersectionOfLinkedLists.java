/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    int getSize(ListNode head) {
        if(head == null)    return 0 ;
        return 1 + getSize(head.next);
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getSize(headA);
        int lenB = getSize(headB);
        while(lenA > lenB) {
            headA = headA.next ;
            lenA-- ;
        }
        while(lenB > lenA) {
            headB = headB.next ;
            lenB-- ;
        }
        while(lenA != 0) {
            if(headA == headB)  return headA ;
            headA = headA.next ;
            headB = headB.next; 
            lenA--;
            lenB-- ;
        }
        return null;
    }
}