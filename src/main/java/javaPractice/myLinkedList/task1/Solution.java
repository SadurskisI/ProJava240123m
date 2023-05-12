package javaPractice.myLinkedList.task1;

    class Solution {


         public class ListNode {
           int val;
           ListNode next;

           ListNode() {}
           ListNode(int val) {
               this.val = val;
           }
           ListNode(int val, ListNode next) {
           this.val = val;
           this.next = next;
           }
         }

        public ListNode reverseList(ListNode head) {
            int[] values = new int[5000];
            int size = 0;

            while (head != null){
                values[size] = head.val;
                head = head.next;
                size++;
            }

            ListNode reversed = new ListNode();
            ListNode current = reversed;
            for (int i = size-1; i >= 0; i--){
                current.next = new ListNode(values[i]);
                current = current.next;

            }

            return reversed.next;
        }
    }

