package easy.problem_21;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode headNode;
        ListNode currentNode;

        if (list1.val > list2.val) {
            headNode = list2;
            list2 = list2.next;
        } else {
            headNode = list1;
            list1 = list1.next;
        }
        currentNode = headNode;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                currentNode.next = list2;
                currentNode = list2;
                list2 = list2.next;
            } else {
                currentNode.next = list1;
                currentNode = list1;
                list1 = list1.next;
            }
        }

        if (list1 == null) {
            currentNode.next = list2;
        }

        if (list2 == null) {
            currentNode.next = list1;
        }

        return headNode;
    }
}
