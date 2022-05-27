package twosum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val size = nums.size
        if (size == 0) return intArrayOf(0)
        if (size == 1) return intArrayOf(0)
        if (size == 2) return intArrayOf(0,1)
        for (i in 0 until size)
        {
            for (j in i+1 until size){
                val actual = nums[i] + nums[j]
                if (actual == target) return intArrayOf(i,j)
            }
        }
        return intArrayOf(0,1)
    }
}
/*
Runtime: 437 ms, faster than 28.68% of Kotlin online submissions for Two Sum.
Memory Usage: 40.8 MB, less than 69.04% of Kotlin online submissions for Two Sum.
 */