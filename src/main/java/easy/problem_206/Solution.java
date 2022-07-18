package easy.problem_206;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;

        ListNode nextNode = head.next;
        ListNode prevNode = null;

        while (nextNode != null) {
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
            nextNode = head.next;
        }

        head.next = prevNode;

        return head;
    }
}
