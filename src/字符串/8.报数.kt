/**
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 *
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 *
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 *
 * 注意：整数顺序将表示为一个字符串。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/39/
 */
fun countAndSay(n: Int): String {
    fun next(str: String): String {
        val sb = StringBuilder()
        var now = str[0]
        var nowNum = 1
        if (str.length == 1)
            return "1$str"
        for (i in 1 until str.length) {
            if (str[i] == now)
                nowNum++
            else {
                sb.append(nowNum)
                    .append(now)
                now = str[i]
                nowNum = 1
            }
            if (i == str.lastIndex)
                sb.append(nowNum)
                    .append(now)
        }
        return sb.toString()
    }

    var result = "1"
    for (i in 1 until n)
        result = next(result)
    return result
}
/**
 * 解题分析：
 * 字符串拆分计数
 */