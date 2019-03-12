package 数组

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 * 题目链接：
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/22/
 */

fun maxProfit(prices: IntArray): Int {
    if (prices.size < 2)
        return 0
    var sum = 0
    var input = 0
    for (temp in 1 until prices.size) {
        if (prices[temp] < prices[temp - 1]) {//这个价格相对于上一天降了，那么应该在上一天的时候卖出去
            sum += (prices[temp - 1] - prices[input])
            input = temp
        }
        if (temp == prices.lastIndex) {//如果是最后一天了，那么该卖出去
            sum += (prices[temp] - prices[input])
        }
    }
    return sum
}

/**
 * 解题分析：
 * 使用一个input用来存储是哪一天买入的
 * 总共有两种情况：
 * 1. 当价格相比于昨天上升时，那么input不变
 * 2. 当价格相比于昨天下降时，那么也就是说一段时间内昨天是价格最高的点，那么把股票在昨天卖出，在今天买入（待评估）
 */