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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode head = l3;
        int qt = 0;

        // int qut = (l1.val + l2.val) / 10;
        // int rem = (l1.val + l2.val + qtval) % 10;

        while(  l1 != null || l2 != null || qt != 0){
       int sum = qt;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
    int rem = sum % 10;
    qt = sum / 10;
    
    l3.next = new ListNode(rem);
     
    l3 = l3.next;

            
        }
        return head.next;
    }
}
