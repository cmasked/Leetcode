// Last updated: 27/08/2026, 21:40:08
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
14        ListNode fast=head;
15        ListNode slow=head;
16        
17        
18        while(fast != null && fast.next != null){
19            fast=fast.next.next;
20            slow=slow.next;
21
22            if(slow==fast){
23                return true;
24            }
25
26                   
27        }
28
29
30        return false;
31        
32    }
33}