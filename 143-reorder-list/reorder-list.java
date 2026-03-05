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
        
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode dummy=slow.next;
        slow.next=null;
        ListNode curr=dummy;
        ListNode next=null;
        ListNode pre=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        ListNode second=pre;
        ListNode first=head;
        while(second!=null&&first!=null)
        {
            ListNode fir=first.next;
            ListNode sec=second.next;
            first.next=second;
            second.next=fir;
            second=sec;
            first=fir;
        }
        
    }
}