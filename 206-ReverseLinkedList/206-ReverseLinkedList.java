// Last updated: 24/08/2026, 18:37:16
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverseList(ListNode head) {
13        ListNode prev=null;
14        ListNode  current=head;
15        
16        while(current!=null){
17            ListNode next=current.next;
18            current.next=prev;
19            prev=current;
20            current=next;
21        }
22        return prev;
23
24        
25    }
26}