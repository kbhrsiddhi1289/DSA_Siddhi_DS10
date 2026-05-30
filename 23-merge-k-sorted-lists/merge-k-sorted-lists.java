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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (ListNode node : lists) {

            while (node != null) {
                arr.add(node.val);
                node = node.next;
            }
        }

        Collections.sort(arr);

        ListNode head = new ListNode(0);
        ListNode temp = head;

        for (int num : arr) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }

        return head.next;
        
    }
}