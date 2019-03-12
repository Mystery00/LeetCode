package 数组

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * 说明:
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的原地算法。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/23/
 */
fun rotate1(nums: IntArray, k: Int) {
    val tk = k % nums.size//对k进行取余操作，过滤多次的变换
    if (tk == 0)//如果移动次数是数组长度的整数倍，那么数组无需移动
        return
    for (now in 0 until tk) {
        val temp = nums.last()
        for (i in nums.lastIndex downTo 1) {
            nums[i] = nums[i - 1]
        }
        nums[0] = temp
    }
}

fun rotate2(nums: IntArray, k: Int) {
    val tk = k % nums.size//对k进行取余操作，过滤多次的变换
    if (tk == 0)//如果移动次数是数组长度的整数倍，那么数组无需移动
        return
    if (nums.size < 2)
        return
    val newArray = IntArray(nums.size) { i -> nums[(i + k) % nums.size] }
    for (i in nums.indices)
        nums[i] = newArray[i]
}

fun rotate3(nums: IntArray, k: Int) {
    val tk = k % nums.size//对k进行取余操作，过滤多次的变换
    if (tk == 0)//如果移动次数是数组长度的整数倍，那么数组无需移动
        return
    if (nums.size < 2)
        return
    fun reverse(nums: IntArray, start: Int = 0, end: Int = nums.size) {
        var left = start
        var right = end - 1
        while (right > left) {
            nums[left] = nums[left] + nums[right]
            nums[right] = nums[left] - nums[right]
            nums[left] = nums[left] - nums[right]
            left++
            right--
        }
    }
    reverse(nums)
    reverse(nums, end = tk)
    reverse(nums, start = tk)
}
/**
 * 解题分析：
 * 1. 将多次移动操作分解为每次移动一步的操作，这种方法比较耗时
 * 2. 创建一个新的数组，然后在赋值的时候进行移动操作，最后将数据拷贝回原数组
 * 2. 创建一个新数组，数组长度为nums.size+k，将k之后的数据放进新数组，k之前的数据放在nums.size之后，最后截取数组
 * 3. 不用创建数组，使用三次数组翻转即可，具体看代码
 */