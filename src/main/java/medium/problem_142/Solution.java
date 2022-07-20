package medium.problem_142;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                while (slow != head) {
                    slow = slow.next;
                    head = head.next;
                }

                return slow;
            }
        }

        return null;
    }
}
