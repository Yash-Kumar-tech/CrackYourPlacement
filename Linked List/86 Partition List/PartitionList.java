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
    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> more = new ArrayList<>();
        ListNode temp = head ;
        while(temp != null) {
            if(temp.val < x) {
                less.add(temp.val) ;
            } else {
                more.add(temp.val) ;
            }
            temp = temp.next ;
        }
        if(less.size() != 0)
            temp = new ListNode(less.get(0)) ;
        else if(more.size() != 0)
            temp = new ListNode(more.get(0)) ;
        else
            return head ;
        ListNode ans = temp ;
        for(int i = 1; i < less.size(); i++)  {
            ListNode ext = new ListNode(less.get(i)) ;
            temp.next = ext ;
            temp = temp.next ;
        }
        for(int i = less.size() == 0 ? 1 : 0; i < more.size(); i++)  {
            ListNode ext = new ListNode(more.get(i)) ;
            temp.next = ext ;
            temp = temp.next ;
        }
        return ans ;
    }
}