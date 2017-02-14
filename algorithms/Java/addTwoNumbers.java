/**
 * Created by codingBoy on 17/2/10.
 */
public class addTwoNumbers
{
    /**
     *
     You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

     You may assume the two numbers do not contain any leading zero, except the number 0 itself.

     Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     Output: 7 -> 0 -> 8

     给出两个非空链表，表示两个非负整数。数字以相反的顺序存储，每个节点包含一个位数。添加两个数字并将其返回为链表。
     你可以假设这两个数字不包含任何前导零，除了数字0本身。
     输入：（2 - > 4 - > 3）+（5 - > 6 - >）
     输出：7 - > 0 - > 8
     */

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode ln1 = l1, ln2 = l2, head = null, node = null;
//        int carry = 0, remainder = 0, sum = 0;
//        head = node = new ListNode(0);
//
//        while(ln1 != null || ln2 != null || carry != 0) {
//            sum = (ln1 != null ? ln1.val : 0) + (ln2 != null ? ln2.val : 0) + carry;
//            carry = sum / 10;
//            remainder = sum % 10;
//            node = node.next = new ListNode(remainder);
//            ln1 = (ln1 != null ? ln1.next : null);
//            ln2 = (ln2 != null ? ln2.next : null);
//        }
//        return head.next;   //为啥不是返回head？？
//    }

//    需要知道链表的数据结构
//    class ListNode {
//        ListNode next;
//        int val;
//        ListNode(int x){
//            val = x;
//            next = null;
//        }
//    }
}
