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
    fun isValidTree(child: TreeNode?, parentVal: Int, compare: (Int, Int) -> Boolean): Boolean {
        if (child == null)
            return true
        val left = if (child.left != null)
            isValidTree(child.left, child.`val`) { c, parent -> c < parent }
        else
            true
        val right = if (child.right != null)
            isValidTree(child.right, child.`val`) { c, parent -> c > parent }
        else
            true
        return compare(child.`val`, parentVal) && left && right
    }
    if (root == null)
        return true
    return isValidTree(root, 1) { _, _ -> true }
}
/**
 * 解题分析：
 * TODO
 */