package easy.problem_876;

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int length = 0;

        while (current != null) {
            length++;
            current = current.next;
        }

        current = head;

        for (int i = 0; i < length / 2; i++) {
            current = current.next;
        }

        return current;
    }
}
