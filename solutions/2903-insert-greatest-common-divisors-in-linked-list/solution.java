import java.util.*;
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
    private int gcd(int a , int b){
        return b == 0 ? Math.abs(a):gcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        ListNode curr = head;
        ListNode nextVal = curr.next;

        while(nextVal != null){
            int a = curr.val;
            int b = nextVal.val;
            ListNode mid = new ListNode(gcd(a,b));
            mid.next = nextVal;
            curr.next = mid;

            curr = nextVal;
            nextVal = nextVal.next;
        }
        return head;
    }
}
