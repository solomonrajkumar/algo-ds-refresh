package arrrays

fun main() {
    sortByParity()
}

fun sortByParity() {
    val nums = arrayOf(3,1,2,4)
    val newNums = IntArray(nums.size)
    var arr1Index = 0
    var arr2StartIndex = 0
    var arr2EndIndex = nums.size - 1
    while (arr1Index < nums.size) {
        if (nums[arr1Index] % 2 == 0) {
            newNums[arr2StartIndex] = nums[arr1Index]
            arr2StartIndex++
        } else if (nums[arr1Index] % 2 != 0) {
            newNums[arr2EndIndex] = nums[arr1Index]
            arr2EndIndex--
        }
        arr1Index++
    }
    println(newNums.joinToString())
}