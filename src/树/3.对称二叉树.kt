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
    val left = ArrayList<Int>()
    val right = ArrayList<Int>()
    val printLeft = ArrayList<Int>()
    val printRight = ArrayList<Int>()

    /**
     * 左子树的中序遍历
     */
    fun centerLeft(root: TreeNode?) {
        if (root == null)
            return
        centerLeft(root.left)
        left.add(root.`val`)
        centerLeft(root.right)
    }

    /**
     * 右子树的中序遍历
     */
    fun centerRight(root: TreeNode?) {
        if (root == null)
            return
        centerRight(root.right)
        right.add(root.`val`)
        centerRight(root.left)
    }

    /**
     * 左子树的前序遍历
     */
    fun beforeLeft(root: TreeNode?) {
        if (root == null)
            return
        printLeft.add(root.`val`)
        beforeLeft(root.left)
        beforeLeft(root.right)
    }

    /**
     * 右子树的前序遍历
     */
    fun beforeRight(root: TreeNode?) {
        if (root == null)
            return
        printRight.add(root.`val`)
        beforeRight(root.right)
        beforeRight(root.left)
    }

    centerLeft(root.left)
    centerRight(root.right)

    beforeLeft(root.left)
    beforeRight(root.right)

    if (left.size != right.size)
        return false

    for (i in left.indices) {
        if (left[i] != right[i])
            return false
    }
    for (i in printLeft.indices) {
        if (printLeft[i] != printRight[i])
            return false
    }
    return true
}
/**
 * 解题分析：
 * 由于是对称二叉树，那么思路自然是拆分为两个二叉树来比较两个二叉树是否对称即可。
 * 所以可以用遍历的形式（遍历的步骤不同）将节点数据存储到ArrayList中然后比较两个ArrayList是否相同。
 *
 * 注意：只用前序遍历、中序遍历、后序遍历中的一种是不能唯一确定一颗二叉树的，所以至少用两个遍历方式来进行比较，测试用例中有一个用例专门测试这种情况。
 */