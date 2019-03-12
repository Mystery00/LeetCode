/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 注意:
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/33/
 */
fun reverse(x: Int): Int {
    return try {
        val tx = if (x < 0) -x else x
        var str = tx.toString().reversed()
        val result = str.toInt()
        if (x < 0)
            -result
        else
            result

    } catch (e: Exception) {
        0
    }
}

fun reverse1(x: Int): Int {
    var xx = x
    var result = 0L
    while (xx != 0) {
        result = result * 10 + xx % 10
        xx /= 10
        if (result < Int.MIN_VALUE || result > Int.MAX_VALUE)
            return 0
    }
    return result.toInt()
}
/**
 * 解题分析：
 * 基本思路如题，第一种是使用Java/Kotlin的API来对字符串进行反转操作，第二种是按位反转
 */