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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null||head.next==null)return head;
        ListNode firstK=head;
        for(int i=0;i<k-1;i++){
            firstK=firstK.next;
        }
        ListNode slow=head;
        ListNode fast=firstK;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode lastK=slow;
        int temp=firstK.val;
        firstK.val=lastK.val;
        lastK.val=temp;
        return head;
    }
}