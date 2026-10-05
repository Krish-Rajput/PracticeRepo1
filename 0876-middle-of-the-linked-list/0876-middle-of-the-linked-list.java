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
    public ListNode middleNode(ListNode head) {
      ListNode tempslow=head;
      ListNode tempfast=head;
      while(tempfast!=null&&tempfast.next!=null){
        tempslow=tempslow.next;
        tempfast=tempfast.next.next;
      }
      return tempslow;  
    }
}