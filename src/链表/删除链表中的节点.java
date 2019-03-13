package 链表;

/**
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 * <p>
 * 说明:
 * <p>
 * 链表至少包含两个节点。
 * 链表中所有节点的值都是唯一的。
 * 给定的节点为非末尾节点并且一定是链表中的一个有效节点。
 * 不要从你的函数中返回任何结果。
 * <p>
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/41/
 */
public class 删除链表中的节点 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */


    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
/**
 * 解题分析：
 * 由于题中只给了需要删除的节点，没有给链表的头结点，那么不能用遍历的方法去实现，既然要删除指点节点，那么分为两个步骤，将需要删除节点的val更改为下一个节点的val，然后覆盖next指针。
 */