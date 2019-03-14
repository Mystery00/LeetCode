import 树.TreeNode

/**
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/51/
 */
fun sortedArrayToBST(nums: IntArray): TreeNode? {
    //TODO
    //错误！！！！
    if (nums.isEmpty())
        return null
    var level = 1
    while (true) {
        val less = Math.pow(2.0, (level - 1).toDouble()) - 1
        val more = Math.pow(2.0, level.toDouble()) - 1
        if (nums.size.toDouble() in (less + 1)..more)
            break
        level++
    }
    var index = 0

    fun buildTree(root: TreeNode, nowLevel: Int) {
        if (index > nums.lastIndex)//这个时候已经没有数据了
            return
        if (nowLevel < level) {
            if (index > nums.lastIndex)
                return
            val left = TreeNode(-1)
            root.left = left
            buildTree(left, nowLevel + 1)
        }
        if (index > nums.lastIndex)
            return
        root.`val` = nums[index++]
        if (nowLevel < level) {
            if (index > nums.lastIndex)
                return
            val right = TreeNode(-1)
            root.right = right
            buildTree(right, nowLevel + 1)
        }
    }

    val head = TreeNode(0)
    buildTree(head, 1)
    return head
}
/**
 * 解题分析：
 * TODO
 */