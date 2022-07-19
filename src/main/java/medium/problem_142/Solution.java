package medium.problem_142;

import java.util.ArrayList;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ArrayList<ListNode> previousNodes = new ArrayList<>();
        ListNode current = head;

        while (current != null) {
            if (previousNodes.contains(current)) {
                return current;
            }
            previousNodes.add(current);
            current = current.next;
        }

        return null;
    }
}
