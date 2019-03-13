package 链表;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/44/
 */
public class 合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode end = head;
        while (l1 != null && l2 != null) {
            int v1 = l1.val;
            int v2 = l2.val;
            if (v1 < v2) {
                end.next = l1;
                end = l1;
                l1 = l1.next;
            } else if (v1 > v2) {
                end.next = l2;
                end = l2;
                l2 = l2.next;
            } else {
                end.next = l1;
                end = l1;
                l1 = l1.next;
                end.next = l2;
                end = l2;
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            end.next = l1;
            end = l1;
            l1 = l1.next;
        }
        while (l2 != null) {
            end.next = l2;
            end = l2;
            l2 = l2.next;
        }
        if (head.next == null)
            return null;
        return head.next;
    }
}
/**
 * 解题分析：
 * 简单题：和数组的“两个数组的交集”思想相同，两个指针，每次都把小的元素加入新链表中，最后添加剩余的元素。
 */