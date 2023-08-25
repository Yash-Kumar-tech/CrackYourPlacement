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
    public boolean isPalindrome(ListNode head) {
        StringBuilder content = new StringBuilder("");
        while(head != null) {
            content.append(Integer.toString(head.val));
            head = head.next ;
        }
        return content.toString().equals(content.reverse().toString());
    }
}