/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int sum = 0;
        HashMap<Integer, ListNode> map = new HashMap<>();
        for (ListNode temp = dummy; temp != null; temp = temp.next) {
            sum += temp.val;
            map.put(sum, temp);
        }
        sum = 0;
        for (ListNode temp = dummy; temp != null; temp = temp.next) {
            sum += temp.val;
            temp.next = map.get(sum).next;
        }
        return dummy.next;
    }
}