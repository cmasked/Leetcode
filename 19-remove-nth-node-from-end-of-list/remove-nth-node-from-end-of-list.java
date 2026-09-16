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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count_nodes =0;
        ListNode finalhead=head;
        while(head != null){
            head=head.next;
            count_nodes++;
        }
        ListNode newpart=head;
        int count=0;
        while(head!=null){
            if(count == count_nodes-n+1){
            newpart=head.next;

            }
            head=head.next;
            count++;
        
        }
        head=finalhead;
        count=0;
        while(head!=null){
            if(count== count_nodes-n-1){
                
            head.next=head.next.next;
            break;
            

            }  
            if (n == count_nodes) {
                finalhead = finalhead.next;
                break;
        }       
           head=head.next;
           count++;   

        }
        return finalhead;
        
    }
}