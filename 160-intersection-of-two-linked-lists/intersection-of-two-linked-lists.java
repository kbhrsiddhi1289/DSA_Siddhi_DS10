/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        // Traverse both lists
        while (a != b) {
            // When a reaches the end, start from headB
            a = (a == null) ? headB : a.next;
            // When b reaches the end, start from headA
            b = (b == null) ? headA : b.next;
        }

        // Either they meet at intersection or both become null
        return a;
    }
}