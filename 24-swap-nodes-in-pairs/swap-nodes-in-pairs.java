
class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode temp = head;

        while (temp != null && temp.next != null) {

            ListNode front = temp.next;

            temp.next = front.next;
            front.next = temp;

            if (prev == null) {
                head = front;
            } else {
                prev.next = front;
            }

            prev = temp;
            temp = temp.next;
        }

        return head;
    }
}
