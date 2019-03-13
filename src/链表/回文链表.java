package 链表;

/**
 * 请判断一个链表是否为回文链表。
 * <p>
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 * <p>
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/45/
 */
public class 回文链表 {
    public boolean isPalindrome(ListNode head) {
        ListNode reversed = reverseList(head);
        while (head != null) {
            if (reversed.val != head.val)
                return false;
            head = head.next;
            reversed = reversed.next;
        }
        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode temp = new ListNode(head.val);
            temp.next = newHead;
            newHead = temp;
            head = head.next;
        }
        return newHead;
    }
}
/**
 * 解题分析：
 * 主要有三种解法：
 * 1. 最简单的方法：将链表转换为数组或者ArrayList然后利用数组的方法求解
 * 2. 先反转链表，然后按位比较
 * 3. 进阶方法：先使用快慢中点法找到中点，然后把前半部分的数据放进栈中，然后依次出栈进行比较
 */