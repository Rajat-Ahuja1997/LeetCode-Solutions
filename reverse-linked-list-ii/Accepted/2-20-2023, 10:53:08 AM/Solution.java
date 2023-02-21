// https://leetcode.com/problems/reverse-linked-list-ii

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev = null;
        ListNode current = head;
        while (left > 1) {
            prev = current;
            current = current.next;
            left--;
            right--; // we subtract right as well because we are starting from the beginning of the list and this helps us track the elements between right and left;
        }
        // this points to the element that will point to the beginning of our reversed sublist
        ListNode startConnector = prev;
        // this points to the element that will point to the element after our reverse sublist
        ListNode tailConnector = current;

        // now we reverse
        while (right > 0) {
            ListNode next =current.next;
            current.next = prev;
            prev = current;
            current = next;
            right--;
        }

        if (startConnector != null) {
            startConnector.next = prev;
        } else {
            head = prev;
        }

        tailConnector.next = current;
        return head;
    }
}