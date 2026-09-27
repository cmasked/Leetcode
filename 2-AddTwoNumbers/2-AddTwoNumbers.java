// Last updated: 27/09/2026, 12:08:22
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13
14        ListNode dummy=new ListNode(0);
15        int carry=0;
16        int y=0;
17        int x=0;
18        ListNode answer=dummy;
19
20        while(l1 != null || l2 != null || carry!=0){
21            dummy.next=new ListNode(0);
22            if(l1== null){
23                x=0;
24
25            }
26            else{
27                x=l1.val;
28            }
29
30            
31            if(l2==null){
32                y=0;
33
34            }
35            else{
36                y=l2.val;
37
38            }
39            
40            
41
42            if(x+y+carry>9){
43                dummy.next.val=x+y+carry-10;
44
45            }
46            else{
47                dummy.next.val=x+y+carry;
48
49            }
50            
51            carry=(x+y+carry)/10;
52
53            dummy=dummy.next;
54            if(l1 != null){
55                l1=l1.next;
56
57            }
58            if(l2 != null){
59                l2=l2.next;
60
61            }
62            
63            
64            
65        }
66        return answer.next;
67       
68    }
69}