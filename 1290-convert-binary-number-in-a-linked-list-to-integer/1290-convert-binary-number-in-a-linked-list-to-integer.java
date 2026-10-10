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
    public ListNode rev(ListNode head){
        if(head==null||head.next==null)return head;
        ListNode newHead=rev(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        head=rev(head);
        int exp=0;
        int sum=0;
        temp=head;
        while(temp!=null){
            sum+=temp.val*(int)Math.pow(2,exp);
            temp=temp.next;
            exp++;
        }
        return sum;
    }
}