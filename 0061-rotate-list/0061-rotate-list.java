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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0)return head;
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        int actrot=k%len;
        if(actrot==0)return head;
        ListNode fast=head;
        for(int i=0;i<actrot-1;i++){
            fast=fast.next;
        }ListNode prev=null;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=head;
        head=slow;
        prev.next=null;
        return head;
    }
}