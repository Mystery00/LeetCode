/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/40/
 */
fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty())
        return ""
    val max = strs.minBy { it.length }!!.length
    for (i in 1..max) {
        val str = strs[0].substring(0, i)
        for (k in 1 until strs.size) {
            if (!strs[k].startsWith(str))
                return str.substring(0, i - 1)
        }
    }
    return strs[0].substring(0, max)
}
/**
 * 解题分析：
 * 首先确定公共串的最长长度（数组中长度最短元素的长度），然后依次取每个元素的前几位进行比较，如果不相同则找到
 */