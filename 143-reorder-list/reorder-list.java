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
        ListNode fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
     ListNode dummy=slow.next;
     slow.next=null;
     ListNode curr=dummy;
     ListNode pre=null;
     ListNode next=null;
     while(curr!=null)
     {
        next=curr.next;
        curr.next=pre;
        pre=curr;
        curr=next;
     }
    ListNode first=head;
    ListNode second=pre;
    while(second!=null)
    {
        ListNode ft=first.next;
        ListNode st=second.next;
        first.next=second;
        second.next=ft;
        first=ft;
        second=st;
    }
    
        

     }
}

    //  ListNode dummy2=pre;
    //  ListNode res=null;
    //  int i=1;
    //  ListNode dummy3=head;
    //  while(dummy2!=null||dummy3!=null)
    //  {
    //     if(i%2!=0)
    //     {
    //     res.next=dummy3;
    //     dummy3=dummy3.next;
    //     i++;
    //     }
    //     else
    //     {
    //         res.next=dummy2;
    //         dummy2=dummy2.next;
    //         i++;
    //     }
    //  }

