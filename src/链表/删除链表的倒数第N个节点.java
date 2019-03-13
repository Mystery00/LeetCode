package 链表;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 说明：
 * 给定的 n 保证是有效的。
 * <p>
 * 进阶：
 * 你能尝试使用一趟扫描实现吗？
 * <p>
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/42/
 */
public class 删除链表的倒数第N个节点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode end = head.next;
        if (head.next == null) //只有一个节点
            return null;//删除之后就是空的
        for (int i = 1; i < n; i++)
            end = end.next;
        while (true) {
            if (end == null) {
                return temp.next;
            }
            if (end.next == null) {//end此时为最后一个节点
                if (temp.next == end) {//删除的是倒数第1个元素
                    temp.next = null;
                } else {
                    temp.next = temp.next.next;
                }
                break;
            }
            temp = temp.next;
            end = end.next;
        }
        return head;
    }
}
/**
 * 解题分析：
 * 一般来说有两种解题思路：
 * 1. 使用一个指针，首先第一次遍历确定链表长度，第二次遍历确定需要删除的节点位置
 * 2. 使用两个指针，保证两个指针之间相差需要删除节点位置个节点，然后依次遍历靠后的指针的链表，找到尾节点的同时，前面的指针所指的节点便是需要删除的节点
 */