// Last updated: 16/09/2026, 11:37:01
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        int count_nodes =0;
14        ListNode finalhead=head;
15        while(head != null){
16            head=head.next;
17            count_nodes++;
18        }
19        ListNode newpart=head;
20        int count=0;
21        while(head!=null){
22            if(count == count_nodes-n+1){
23            newpart=head.next;
24
25            }
26            head=head.next;
27            count++;
28        
29        }
30        head=finalhead;
31        count=0;
32        while(head!=null){
33            if(count== count_nodes-n-1){
34                
35            head.next=head.next.next;
36            break;
37            
38
39            }  
40            if (n == count_nodes) {
41                finalhead = finalhead.next;
42                break;
43        }       
44           head=head.next;
45           count++;   
46
47        }
48        return finalhead;
49        
50    }
51}