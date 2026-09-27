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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy=new ListNode(0);
        int carry=0;
        int y=0;
        int x=0;
        ListNode answer=dummy;

        while(l1 != null || l2 != null || carry!=0){
            dummy.next=new ListNode(0);
            if(l1== null){
                x=0;

            }
            else{
                x=l1.val;
            }

            
            if(l2==null){
                y=0;

            }
            else{
                y=l2.val;

            }
            
            

            if(x+y+carry>9){
                dummy.next.val=x+y+carry-10;

            }
            else{
                dummy.next.val=x+y+carry;

            }
            
            carry=(x+y+carry)/10;

            dummy=dummy.next;
            if(l1 != null){
                l1=l1.next;

            }
            if(l2 != null){
                l2=l2.next;

            }
            
            
            
        }
        return answer.next;
       
    }
}