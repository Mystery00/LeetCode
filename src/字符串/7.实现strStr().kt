/**
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 说明:
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/38/
 */
fun strStr(haystack: String, needle: String): Int {
    if (needle == "")
        return 0
    if (needle.length > haystack.length)
        return -1
    for (i in 0..haystack.length - needle.length) {
        if (haystack.substring(i, i + needle.length) == needle)
            return i
    }
    return -1
}
/**
 * 解题分析：
 * 主要要考虑几种特殊情况：
 * 1. needle为空时，不管haystack是否为空，那么都应该返回0
 * 2. 如果needle串长度大于haystack串，那么肯定是返回-1
 * 3. 剩下的自然是依次判断，注意循环的终止位置
 */