/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/21/
 */

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty())
        return 0
    var index = 0
    for (i in 1 until nums.size) {
        if (nums[index] != nums[i]) {
            nums[++index] = nums[i]
            //使用==index的原因是为了保留第一位的数据并且向后移动指针
            //如果不理解的话可以用示例数据来进行手动演示
        }
    }
    return index + 1
}

/**
 * 解题解析：
 * 因为题中所给数组是排序数组，所以只可能相同的元素彼此相邻，那么可以用上面的算法依次判断：
 * 使用一个指针来指向每一段相同数字的起始位置，然后从这个位置依次往后遍历，当不相同时，指针指向变化，最后指针变换的次数加上1就是去重数组的长度
 */