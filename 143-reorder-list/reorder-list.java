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
    public void reorderList(ListNode head) {
        
        int count=0;
        int calc=0;

        ListNode prev=null;
        ListNode current=head;
        ListNode dummy = new ListNode(0);
        ListNode listform = dummy;
        ListNode originalHead = head;
       


        while(current!=null){
                 ListNode newNode = new ListNode(current.val);
            
                newNode.next = prev; 

                prev = newNode;
                current = current.next;
                count++;   
        }
        while(calc<count){
            
            if(calc % 2==0){
                listform.next = new ListNode(originalHead.val);
                
                originalHead=originalHead.next;
                calc++;
                listform=listform.next;
            }
            else{
                
                listform.next = new ListNode(prev.val);
                prev=prev.next;
                calc++;
                listform=listform.next;
                
            }

            
            
        }
        ListNode result =dummy.next;
        while(result != null){
            head.val = result.val;
            head = head.next;
            result=result.next;
            

        }
        

        
    }
}