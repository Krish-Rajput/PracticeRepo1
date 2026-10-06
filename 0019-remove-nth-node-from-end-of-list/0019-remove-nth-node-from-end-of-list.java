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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dum=new ListNode(0);
        dum.next=head;
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(n>len||n<=0)return head;
        int actlen=len-n;
        temp=dum;
        for(int i=0;i<actlen;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return dum.next;
    }
}