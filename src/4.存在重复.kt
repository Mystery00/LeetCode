/**
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/24/
 */
fun containsDuplicate(nums: IntArray): Boolean {
    return nums.size != nums.toSet().size
}
/**
 * 解题分析：
 * 利用set的特性，会自动过滤重复元素，那么将数组转成set，然后比较长度是否相同即可
 *
 * 其他答案：先对数组排序，然后一次比较相邻元素是否相同
 */