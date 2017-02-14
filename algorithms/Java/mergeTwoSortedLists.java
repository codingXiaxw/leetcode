/**
 * Created by codingBoy on 17/2/5.
 */
public class mergeTwoSortedLists {
    /**
     * Merge two sorted linked lists and return it as a new list.
     * The new list should be made by splicing together the nodes of the first two lists.
     * 合并两个已排序的链表并将其返回为新列表。新的列表应该由前两个列表的节点拼接而成。
     */
/**
 *
 * 法一:
 *  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
 ListNode dump = new ListNode(0);
 ListNode tail = dump;

 while (l1 != null && l2 !=null) {
 if (l1.val < l2.val) {
 tail.next = l1;
 tail = tail.next;
 l1 = l1.next;
 } else {
 tail.next = l2;
 tail = tail.next;
 l2 = l2.next;
 }

 if (l1 != null) {
 tail.next = l1;
 } else {
 tail.next = l2;
 }
 }

 return dump.next;
 }
 */
}
