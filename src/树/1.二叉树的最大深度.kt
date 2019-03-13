import 树.TreeNode
import kotlin.math.max

/**
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/47/
 */
fun maxDepth(root: TreeNode?): Int {
    if (root == null)
        return 0
    val left = if (root.left != null)
        maxDepth(root.left)
    else
        0
    val right = if (root.right != null)
        maxDepth(root.right)
    else
        0
    return max(left, right) + 1
}
/**
 * 解题分析：
 * 使用递归遍历左子树和右子树然后取深度大的值加一返回结果
 */