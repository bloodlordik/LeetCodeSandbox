@file:Suppress("SpellCheckingInspection")

package twosum

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

internal class SolutionTest{
    private val solution = Solution()
    @Test fun `Example 1`(){
        val nums = intArrayOf(2,7,11,15)
        val target = 9
        val actual = solution.twoSum(nums, target)
        val expect = intArrayOf(0,1)
        assertArrayEquals(expect, actual)
    }
    @Test fun `Example 2`(){
        val nums = intArrayOf(3,2,4)
        val target = 6
        val actual = solution.twoSum(nums, target)
        val expect = intArrayOf(1,2)
        assertArrayEquals(expect, actual)
    }
    @Test fun `Example 3`(){
        val nums = intArrayOf(3,3)
        val target = 6
        val actual = solution.twoSum(nums, target)
        val expect = intArrayOf(0,1)
        assertArrayEquals(expect, actual)
    }

}