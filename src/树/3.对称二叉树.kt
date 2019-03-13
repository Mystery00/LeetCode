import 树.TreeNode

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/49/
 */
fun isSymmetric(root: TreeNode?): Boolean {
    if (root == null)
        return true
    if (root.left != null && root.right != null) {
        return isSymmetric(root.left) && isSymmetric(root.right) && (root.left!!.`val` == root.right!!.`val`)
    }
    return false
}
/**
 * 解题分析：
 * TODO
 */