package arrrays

import kotlin.math.abs

fun main() {
    val nums = arrayOf(-8,-4,-1,0,3,10)
    val squaredNums = IntArray(nums.size)
    var start = 0
    var end = nums.size - 1
    var pointer = nums.size - 1
    while(pointer >= 0) {
        if (abs(nums[start]) > abs(nums[end])) {
            squaredNums[pointer--] = nums[start] * nums[start]
            start++
        } else {
            squaredNums[pointer--] = nums[end] * nums[end]
            end--
        }
    }
    println(squaredNums.joinToString())
}