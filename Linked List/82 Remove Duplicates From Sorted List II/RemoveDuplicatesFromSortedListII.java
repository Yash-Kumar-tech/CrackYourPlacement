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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)    return null ;
        if(head.next == null)   return head ;
        ArrayList<Integer> list = new ArrayList<>();
        ListNode tmp = head ;
        while(tmp != null) {
            list.add(tmp.val);
            tmp = tmp.next; 
        }
        
    }
}