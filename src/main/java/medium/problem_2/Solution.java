package medium.problem_2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumList = null;
        ListNode prevNode = null;
        int memory = 0;

        while (l1 != null || l2 != null || memory > 0) {
            int sum = memory;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            memory = sum / 10;
            sum %= 10;

            if (sumList == null) {
                sumList = new ListNode(sum);
                prevNode = sumList;
            } else {
                prevNode.next = new ListNode(sum);
                prevNode = prevNode.next;
            }
        }

        return sumList;
    }
}
