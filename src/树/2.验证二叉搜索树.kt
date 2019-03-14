import 树.TreeNode

/**
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/48/
 */
fun isValidBST(root: TreeNode?): Boolean {
    if (root == null)
        return true
    fun isValidTree(now: TreeNode?, min: Long, max: Long): Boolean {
        if (now == null)
            return true
        if (now.`val` !in (min + 1)..(max - 1)) return false
        return isValidTree(now.left, min, now.`val`.toLong()) && isValidTree(now.right, now.`val`.toLong(), max)
    }
    return isValidTree(root, Long.MIN_VALUE, Long.MAX_VALUE)
}

fun isValidBST1(root: TreeNode?): Boolean {
    if (root == null)
        return true
    val list = ArrayList<Int>()
    /**
     * 中序遍历
     */
    fun centerPrint(root: TreeNode?) {
        if (root == null)
            return
        centerPrint(root.left)
        list.add(root.`val`)
        centerPrint(root.right)
    }
    centerPrint(root)

    for (i in 1 until list.size)
        if (list[i - 1] >= list[i])
            return false
    return true
}
/**
 * 解题分析：
 * 两种解题思路：
 * 1. 根据二叉搜索树的性质，来递归进行判断
 * 2. 使用中序遍历将二叉树转换成数组，然后判断数组是否是有序
 */