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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] a = {-1,-1};
        if(head.next == null &&(head.next.next == null && head.next.next.next == null) ){
        return a;

    }
 ArrayList<Integer> idx = new ArrayList<>();
    ListNode prev = head;
    ListNode curr = head.next ;
    ListNode nxt = curr.next;
    int i = 1;
    
    while(nxt != null){
        if((curr.val < prev.val && curr.val < nxt.val) || (curr.val > prev.val && curr.val > nxt.val)){
            idx.add(i);
        }
        prev = curr;
        curr = nxt;
        nxt = nxt.next;
        i++;
    }
if(idx.size() < 2){
    return a;
}
    int max = idx.get(idx.size()-1) - idx.get(0);
    a[1] = max;
    int min = 999999 ;
    for(int j = 0 ; j <= idx.size()-2 ; j++){
        int curmin = idx.get(j+1)-idx.get(j);
        min = Math.min(curmin , min);
    }
    if(idx.size() <= 2){
    min = max;
    }
    a[0] = min;
System.out.println(idx);

return a;
}
}
