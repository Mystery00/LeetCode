import 数组.isValidSudoku
import 链表.ListNode
import 链表.反转链表

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

    val arr = "1234567".toCharArray()
    reverseString(arr)
    println(arr.joinToString())

    println(myAtoi("42"))
    println(myAtoi("   -42"))
    println(myAtoi("4193 with words"))
    println(myAtoi("words and 987"))
    println(myAtoi("-91283472332"))
    println(myAtoi("3.14159"))
    println(myAtoi("20000000000000000000"))
    println(myAtoi("20000000000000000000"))

    println(strStr("hello", "ll"))
    println(strStr("hello", ""))
    println(strStr("aaaaa", "bba"))
    println(strStr("", ""))
    println(strStr("a", "a"))

    println(countAndSay(4))

    println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    println(longestCommonPrefix(arrayOf("dog", "racecar", "car")))
    println(longestCommonPrefix(arrayOf("aaa", "aa", "aaaa")))

    val head = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(3)
    val node4 = ListNode(4)
    val node5 = ListNode(5)
    head.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    var node = 反转链表().reverseList1(head)
    while (node != null) {
        print("${node.`val`} ")
        node = node.next
    }
}