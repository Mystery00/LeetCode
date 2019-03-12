package 数组

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/29/
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val array = IntArray(2)
    for (i in 0 until nums.lastIndex) {
        val need = target - nums[i]
        for (k in 0 until nums.size) {
            if (nums[k] == need) {
                if (i == k)
                    continue
                array[0] = i
                array[1] = k
                return array
            }
        }
    }
    return array
}

fun twoSum1(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    nums.forEachIndexed { index, i -> map[i] = index }
    val array = IntArray(2)
    for (i in 0 until nums.lastIndex) {
        val need = target - nums[i]
        if (map.contains(need) && map[need] != i) {
            array[0] = i
            array[1] = map[need]!!
            return array
        }
    }
    return array
}
/**
 * 解题分析：
 * 暴力法？
 *
 * 使用HashMap来缓存数据，那么内层的for循环改为使用HashMap的查找实现，效率更高
 */