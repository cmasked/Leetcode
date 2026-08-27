/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> seen = new HashSet<>();
        seen.add(head);
        while(head != null){
            
            if(seen.contains(head.next)){
                return true;
            }
            seen.add(head.next);
            head=head.next;
            
        }
        return false;
        
    }
}