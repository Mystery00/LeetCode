/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 注意事项：您可以假定该字符串只包含小写字母。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/34/
 */
fun firstUniqChar(s: String): Int {
    val map = HashMap<Char, Int>()
    s.forEach {
        if (map.contains(it))
            map[it] = map[it]!! + 1
        else
            map[it] = 1
    }
    s.forEachIndexed { index, c ->
        if (map[c] == 1)
            return index
    }
    return -1
}
/**
 * 解题分析：
 * 首先将字符串缓存到HashMap中，存储每个字符出现的次数
 * 然后顺序遍历字符串，直到HashMap中该字符出现次数为1
 */