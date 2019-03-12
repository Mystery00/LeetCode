/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/36/
 */
fun isPalindrome(s: String): Boolean {
    val ts = s.toLowerCase().filter { it in '0'..'9' || it in 'a'..'z' }
    for (i in 0 until ts.length / 2) {
        if (ts[i] != ts[ts.lastIndex - i])
            return false
    }
    return true
}
/**
 * 解题分析：
 * 如题
 */