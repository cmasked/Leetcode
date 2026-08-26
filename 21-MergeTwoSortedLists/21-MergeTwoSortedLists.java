// Last updated: 26/08/2026, 21:44:41
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode dummy = new ListNode(0);
14        ListNode current = dummy;
15        
16
17        while(list1 != null && list2 != null){
18            if(list1.val<list2.val){
19                current.next=list1;
20                current=current.next;
21                list1=list1.next;
22            }
23            else{
24                current.next=list2 ;
25                current=current.next;
26                list2=list2.next;
27
28            }
29
30        }
31        if(list1 == null && list2 != null){
32                current.next=list2;
33                
34            }
35            else if(list2 == null && list1 != null){
36                current.next=list1;
37                
38            }
39        return dummy.next;
40        
41    }
42}