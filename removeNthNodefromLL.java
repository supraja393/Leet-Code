/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    int l=0;
    ListNode temp1=new ListNode(0);
    temp1.next=head;
    if(head==null)
    return head;
    
    ListNode temp2=head; 
    while(temp2!=null)
    { 
        temp2=temp2.next;
        l++;
    }
    if(n==l)
    return head.next; 
    temp2=head;
    int pos=l-n-1; 
    while(pos>=1)
    {
        temp2=temp2.next;
        pos--;
    }
    temp2.next=temp2.next.next;   //we remove node here
    return head;
    }
}