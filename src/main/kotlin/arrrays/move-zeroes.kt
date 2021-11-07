package arrrays

fun main() {
    moveZeroes()
}

fun moveZeroes() {
    var nums = arrayOf(1,0,2,3,0,4)
    var nonZeroIndex = 0
    for  (i in nums.indices) {
        if (nums[i] != 0) {
            nums[nonZeroIndex] = nums[i]
            nonZeroIndex++
        }
    }
    for(i in nonZeroIndex until nums.size) {
        nums[i] = 0
    }
    println(nums.joinToString())
}