/**
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 *
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 *
 * 说明:
 *
 * 一个有效的数独（部分已被填充）不一定是可解的。
 * 只需要根据以上规则，验证已经填入的数字是否有效即可。
 * 给定数独序列只包含数字 1-9 和字符 '.' 。
 * 给定数独永远是 9x9 形式的。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/30/
 */
fun isValidSudoku(board: Array<CharArray>): Boolean {
    fun isValidArray(array: CharArray): Boolean {
        val arr = array.filter { it != '.' }
        return arr.size == arr.toSet().size
    }
    for (i in 0 until 9) {
        val horizontal = board[i]
        val vertical = CharArray(9) { index -> board[index][i] }
        if (!isValidArray(horizontal) || !isValidArray(vertical))
            return false
    }
    for (i in arrayOf(0, 3, 6))
        for (k in arrayOf(0, 3, 6)) {
            val array = CharArray(9) { index ->
                val x = index / 3
                val y = index % 3
                board[k + y][x + i]
            }
            if (!isValidArray(array))
                return false
        }
    return true
}
/**
 * 解题分析：
 * 暴力法？
 * 以此判断三个条件
 */