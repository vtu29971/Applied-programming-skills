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
    public ListNode swapPairs(ListNode head) {
        if((head == null) || (head.next == null)){
            return head;
        }

        ListNode prev = null;

        ListNode newhead = head.next;
        ListNode first = head;
        ListNode second = head.next;
        

        while((first != null) && (second != null)){
            ListNode l1 = second.next;
            second.next = first;
            first.next = l1;

            //move the pointers then

            if(prev != null){
                prev.next = second;
            }

            prev = first;
            first = l1;
            if(first != null){
                second = first.next;
            }

        }
        return newhead;
    }
}
