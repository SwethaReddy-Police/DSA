class Solution {
    public ListNode insertionSortList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode sorted = null;
        ListNode temp = head;

        while (temp != null) {

            ListNode next = temp.next;

            // Insert at beginning
            if (sorted == null || temp.val < sorted.val) {
                temp.next = sorted;
                sorted = temp;
            }
            else {
                ListNode curr = sorted;

                // Find correct position
                while (curr.next != null && curr.next.val < temp.val) {
                    curr = curr.next;
                }

                temp.next = curr.next;
                curr.next = temp;
            }

            temp = next;
        }

        return sorted;
    }
}