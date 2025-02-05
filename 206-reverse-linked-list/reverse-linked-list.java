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
    ListNode head;
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        // itration 

        while(curr!=null){
            
            // befor anything stroing the next pointer value so it wont get lost
             
             next=curr.next;
             // now pointing backword to null
             curr.next=prev;

             // now as we hav next and now curr.next-> to null we can take prev as curr and move curr ahead

             prev=curr;
             curr=next;  // as this next value stored befor as curr.next --> next
        }


        head=prev;  // at last curr goes to right side null and then prev comes ahead as left side is already null
                    // so we make the head--. prev as it is reversed


       return prev;



        
    }
}