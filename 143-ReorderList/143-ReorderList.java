// Last updated: 04/09/2026, 16:44:13
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
12    public void reorderList(ListNode head) {
13        
14        int count=0;
15        int calc=0;
16
17        ListNode prev=null;
18        ListNode current=head;
19        ListNode dummy = new ListNode(0);
20        ListNode listform = dummy;
21        ListNode originalHead = head;
22       
23
24
25        while(current!=null){
26                 ListNode newNode = new ListNode(current.val);
27            
28                newNode.next = prev; 
29
30                prev = newNode;
31                current = current.next;
32                count++;   
33        }
34        while(calc<count){
35            
36            if(calc % 2==0){
37                listform.next = new ListNode(originalHead.val);
38                
39                originalHead=originalHead.next;
40                calc++;
41                listform=listform.next;
42            }
43            else{
44                
45                listform.next = new ListNode(prev.val);
46                prev=prev.next;
47                calc++;
48                listform=listform.next;
49                
50            }
51
52            
53            
54        }
55        ListNode result =dummy.next;
56        while(result != null){
57            head.val = result.val;
58            head = head.next;
59            result=result.next;
60            
61
62        }
63        
64
65        
66    }
67}