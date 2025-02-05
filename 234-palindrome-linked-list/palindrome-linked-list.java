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
    public boolean isPalindrome(ListNode head) {
       
       // finding palindrome
      
      if(head==null || head.next==null){
        return true;  // single node alwsays palindrome
      }


      // now finding the middle element.

      ListNode fast = head;
      ListNode slow = head;

      while( fast!=null && fast.next!=null){
      
      slow = slow.next;
      fast=fast.next.next;

      }

      // reversing second half of the list
       
       ListNode secondhalf = reverseLinkList(slow);

       ListNode firsthalf = head;

       // comparing both halfs

       while(secondhalf!=null){
        
        if(firsthalf.val != secondhalf.val){
        
        return false;

        }


        firsthalf=firsthalf.next;
        secondhalf=secondhalf.next;

       }

       return true;


        
    }

   //  helper function for reversing the LL
   
   private ListNode  reverseLinkList(ListNode head){
    
    ListNode prev=null;
    ListNode curr=head;
    ListNode next=null;

    while(curr!=null){
    
    next=curr.next;

    curr.next=prev;

    prev=curr;
    curr=next;

   }

   head=prev;


   return prev;



   }






}