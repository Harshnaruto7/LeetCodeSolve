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

    public ListNode middleNode(ListNode head) {

     //  solving from fast and slow pointer


     ListNode fast = head;
     ListNode slow = head;

     
     // looping 

     while(fast!=null && fast.next!=null){
          
          slow = slow.next;   // itration
          fast= fast.next.next; // itration (fast)

     }


     return slow;

   




        
    }
}