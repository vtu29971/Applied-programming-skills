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
        boolean flag = true;
        ListNode s , f;
        s = f = head;
        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }
        
        ListNode cur = s.next;
        ListNode prev = null;
        s.next = null;
        while(cur != null){
            ListNode nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }

    s = head;
    while(s != null && prev != null){
        if(s.val != prev.val){
            flag = false;
        }
        s = s.next;
        prev = prev.next;
    }
    
    return flag;
}
}
