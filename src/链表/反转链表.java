package 链表;

/**
 * 反转一个单链表。
 * <p>
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * <p>
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/43/
 */
public class 反转链表 {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode temp = new ListNode(head.val);
            temp.next = newHead;
            newHead = temp;
            head = head.next;
        }
        return newHead;
    }

    public ListNode reverseList1(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode temp = new ListNode(head.val);
        ListNode newHead = reverseList1(head.next);
        ListNode end = newHead;
        while (end.next != null)
            end = end.next;
        end.next = temp;
        return newHead;
    }
}
/**
 * 解题分析：
 * 按题中要求给出两种解答方案：
 * 1. 迭代的方式：主要是新建一个尾节点，然后正向遍历原链表，遍历到一个元素就添加到新链表的头部，最后输出
 * 2. 递归的形式：和迭代方式思想一样，主要是实现不同
 */