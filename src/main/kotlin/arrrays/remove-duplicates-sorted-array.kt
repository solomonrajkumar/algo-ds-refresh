package arrrays

fun main() {
    val nums = arrayOf(0,0,1,1,1,2,2,3,3,4)
    var i = 0
    for (j in 1 until nums.size) {
        if (nums[i] != nums[j]) {
            nums[i + 1] = nums[j]
            i++
        }
    }
    println(nums.joinToString())
}