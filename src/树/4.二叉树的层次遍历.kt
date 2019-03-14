import 树.TreeNode

/**
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/50/
 */
fun levelOrder(root: TreeNode?): List<List<Int>> {
    val list = ArrayList<ArrayList<Int>>()
    if (root == null)
        return list

    fun printLevel(root: TreeNode?, level: Int) {
        if (root == null)
            return
        if (list.lastIndex < level) {
            val needAdd = level - list.size
            for (i in 0..needAdd)
                list.add(ArrayList())
        }
        printLevel(root.left, level + 1)
        list[level].add(root.`val`)
        printLevel(root.right, level + 1)
    }

    printLevel(root, 0)
    return list
}
/**
 * 解题分析：
 * 用个二维的List存出结果，然后在使用递归进行遍历的时候传入当前层数，然后添加节点数据到指定层
 */