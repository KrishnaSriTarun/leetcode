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
    public ListNode removeNodes(ListNode head) {
        if(head.next==null || head==null){
            return head;
        }
        head=reverseList(head);
        ListNode temp=head;
        ListNode maxNode = head;
        while(temp!=null&& temp.next!=null){
            if(temp.next.val<maxNode.val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
                maxNode=temp;
            }
        }
        return reverseList(head);
    }
    private ListNode reverseList(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}