// https://leetcode.com/problems/reorder-list

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
        ListNode mid = getMid(head);
        ListNode secondHead = reverseList(mid);
        ListNode firstHead = head;

        while (firstHead != null && secondHead != null) {
            ListNode temp = firstHead.next;
            firstHead.next = secondHead;
            firstHead = temp;
            
            temp = secondHead.next;
            secondHead.next = firstHead;
            secondHead = temp;
        }

        if (firstHead != null) {
            firstHead.next = null;
        }
    }

    ListNode getMid(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null ){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


}