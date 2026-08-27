// Last updated: 27/08/2026, 19:57:03
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        HashSet<ListNode> seen = new HashSet<>();
15        seen.add(head);
16        while(head != null){
17            
18            if(seen.contains(head.next)){
19                return true;
20            }
21            seen.add(head.next);
22            head=head.next;
23            
24        }
25        return false;
26        
27    }
28}