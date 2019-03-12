/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 说明:
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/28/
 */
fun moveZeroes(nums: IntArray): Unit {
    var end = nums.lastIndex
    var i = 0
    while (true) {
        if (i == end)
            break
        if (nums[i] == 0) {
            for (k in i until end)
                nums[k] = nums[k + 1]
            nums[end] = 0
            end--
        } else {
            i++
        }
    }
}
/**
 * 解题分析：
 * 依次遍历数组，如果元素是0，那么将元素后面的数据依次向前移，同时使得下次循环时下标不变
 */