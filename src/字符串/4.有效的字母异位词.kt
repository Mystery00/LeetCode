/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 *
 * 说明:
 * 你可以假设字符串只包含小写字母。
 *
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/35/
 */
fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length)
        return false
    val sMap = HashMap<Char, Int>()
    val tMap = HashMap<Char, Int>()
    s.forEach {
        if (sMap.contains(it))
            sMap[it] = sMap[it]!! + 1
        else
            sMap[it] = 1
    }
    t.forEach {
        if (tMap.contains(it))
            tMap[it] = tMap[it]!! + 1
        else
            tMap[it] = 1
    }
    if (sMap.keys.size != tMap.keys.size)
        return false
    sMap.keys.forEach {
        if (!tMap.contains(it))
            return false
        if (sMap[it] != tMap[it])
            return false
    }
    return true
}
/**
 * 解题分析：
 * 首先对两个字符串作分析，得到两个HashMap，key为char，value为出现次数
 * 然后依次遍历判断出现次数是否相等
 *
 * 期间判断HashMap长度是否相同来快速结束
 */