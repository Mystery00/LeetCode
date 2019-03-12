/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/27/
 */
fun plusOne(digits: IntArray): IntArray {
    var plusIndex = digits.lastIndex
    do {
        digits[plusIndex] += 1
        if (digits[plusIndex] == 10) {
            digits[plusIndex] = 0
            if (plusIndex == 0) {//如果已经是首位
                return IntArray(digits.size + 1) { i -> if (i == 0) 1 else digits[i - 1] }
            } else
                plusIndex--
        } else
            plusIndex = -1
    } while (plusIndex != -1)
    return digits
}
/**
 * 解题分析：
 * 首先题中没有说数组长度，那么用int还是long都可能崩掉，而且只是需要在最低位加一，那么直接在数组中进行操作即可，然后处理好进位的问题，如果数据是9那么数组长度还要扩充，注意以上的点，那么这道题很简单
 */