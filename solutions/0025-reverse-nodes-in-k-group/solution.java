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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode temp = new ListNode(-1);

        temp.next = head;
        ListNode  prevgrpend = temp;

        while(true){
            ListNode kth = prevgrpend;
            for(int i = 0 ; i < k && kth != null ; i++){
                kth = kth.next;
            }
            //Lesst than k nodes
            if(kth == null){
                break;
            }

            ListNode grpStart = prevgrpend.next;
            ListNode nextgrpStart = kth.next;

            ListNode current , prev ;

            prev = nextgrpStart;
            current = grpStart;

            while(current != nextgrpStart){
                //you get it right , reversing here , the k sized group

                ListNode nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }
            prevgrpend.next = kth;
            prevgrpend = grpStart;
        }
        return temp.next;
    }
}
