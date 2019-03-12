/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 说明：
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 *
 * 进阶:
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/26/
 */
fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val list2 = nums2.toMutableList()
    val result = ArrayList<Int>()
    nums1.forEach { t ->
        if (list2.contains(t)) {
            result.add(t)
            list2.remove(t)
        }
    }
    return IntArray(result.size) { i -> result[i] }
}

fun intersect1(nums1: IntArray, nums2: IntArray): IntArray {
    if (nums1.isEmpty() || nums2.isEmpty())
        return IntArray(0)
    nums1.sort()
    nums2.sort()
    var index1 = 0
    var index2 = 0
    var result = ArrayList<Int>()
    while (true) {
        val temp1 = nums1[index1]
        val temp2 = nums2[index2]
        when {
            temp1 == temp2 -> {
                index1++
                index2++
                result.add(temp1)
            }
            temp1 > temp2 -> index2++
            temp1 < temp2 -> index1++
        }
        if (index1 == nums1.size || index2 == nums2.size)
            break
    }
    return IntArray(result.size) { i -> result[i] }
}
/**
 * 解题分析：
 * 使用List类的contains方法来判断是否含有指定元素，如果包含，那么添加进结果集并且从数组中移除元素
 *
 * 进阶：如果给定数组已经排好序，那么使用两个指针指向两个数组的起始，然后依次比较：获取两个指针指向的元素的大小关系，向后移动指向元素较小的指针，如果元素相同，那么加入结果集，指针都向后移动一位，知道某一个指向数组末尾并判断完毕
 */