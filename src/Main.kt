import 数组.isValidSudoku

fun main(args: Array<String>) {
    val board = arrayOf(
        arrayOf('8', '3', '.', '.', '7', '.', '.', '.', '.'),
        arrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        arrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        arrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        arrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        arrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        arrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        arrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        arrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )
    println(isValidSudoku(board.map { it.toCharArray() }.toTypedArray()))
}