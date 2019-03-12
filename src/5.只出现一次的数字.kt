/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/25/
 */
fun singleNumber(nums: IntArray): Int {
    nums.sort()
    for (i in 0 until nums.size step 2) {
        if (i == nums.lastIndex)
            return nums[i]
        if (nums[i] != nums[i + 1])
            return nums[i]
    }
    return 0
}

fun singleNumber1(nums: IntArray): Int {
    var t = 0
    nums.forEach { t = t xor it }
    return t
}
/**
 * 解题分析：
 * 正规解法：先将数组排序，然后依次判断相邻元素，如果不相同，那么在前面的那个就是结果
 *
 * 高级解法：异或
 * 相同的数字异或自己结果为0，那么依次异或每一个元素，最后的结果就是只出现一次的元素
 */