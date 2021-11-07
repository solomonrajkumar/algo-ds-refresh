package arrrays

fun main() {
    sortByParity()
}

fun sortByParity() {
    val nums = arrayOf(3,1,2,4)
    var i = 0
    var j = nums.size - 1
    while (i < j) {
        if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
            val temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            i++
            j--
        }
        if (nums[i] % 2 == 0) {
            i++
        }
        if (nums[j] % 2 != 0) {
            j--
        }
    }
    println(nums.joinToString())
}