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
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if (n == size) {
            return head.next;
        }
        ListNode curr=head;
        int k=size-n;
        for (int i = 0; i < k - 1; i++) curr = curr.next;
        curr.next=curr.next.next;
        return head;
    }
}