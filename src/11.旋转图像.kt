/**
 * 给定一个 n × n 的二维矩阵表示一个图像。
 * 将图像顺时针旋转 90 度。
 *
 * 说明：
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/31/
 */
fun rotate(matrix: Array<IntArray>): Unit {
    fun rotateInline(matrix: Array<IntArray>, line: Int) {
        val start = line - 1
        val end = matrix.size - line - 1
        val size = matrix.size
        for (i in start..end) {
            val temp = matrix[start][i]
            matrix[start][i] = matrix[size - i - 1][start]
            matrix[size - i - 1][start] = matrix[size - start - 1][size - i - 1]
            matrix[size - start - 1][size - i - 1] = matrix[i][size - start - 1]
            matrix[i][size - start - 1] = temp
        }
    }

    for (i in 1..(matrix.size + 1) / 2)
        rotateInline(matrix, i)
}
/**
 * 解题分析：
 * 按层来旋转
 */