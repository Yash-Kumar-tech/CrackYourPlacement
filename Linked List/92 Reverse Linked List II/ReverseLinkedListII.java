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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right)   return head ;
        List<Integer> lst = new LinkedList<>();
        reverse(head, lst, left, right, 0) ;
        return head ;
    }

    private void reverse(ListNode node, List<Integer> lst, int left, int right, int curr) {
        if(node == null)    return ;
        curr++ ;
        if(curr >= left && curr <= right) {
            lst.add(node.val) ;
        }
        if(curr > right) {
            return ;
        }
        reverse(node.next, lst, left, right, curr);
        if(curr >= left && curr <= right) {
            node.val = lst.get(0);
            lst.remove(0);
        }
    }
}