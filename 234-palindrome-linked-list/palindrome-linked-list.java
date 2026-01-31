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
    public boolean isPalindrome(ListNode head) {
       ListNode temp=head;
       ListNode fast=head;
       ListNode slow=head;
       while(fast!=null&&fast.next!=null)
       {
        slow=slow.next;
        fast=fast.next.next;
       }
       if(fast!=null)
       slow=slow.next;
       ListNode curr=slow;
       ListNode pre=null;
       ListNode next=null;
       while(curr!=null)
       {
        next=curr.next;
        curr.next=pre;
        pre=curr;
        curr=next;
       }
       ListNode a=head;
       ListNode b=pre;
       while(b!=null)
       {
        if(a.val!=b.val)
        return false;
        a=a.next;
        b=b.next;
       }
        return true;
    }
}