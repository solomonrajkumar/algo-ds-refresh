package arrrays

fun main() {
//    val nums = arrayOf(0,1,2,2,3,0,4,2)
    val nums = arrayOf(2)
    val numToRemove = 3
    var i = 0
    var j = nums.size - 1
    while (i <= j) {
        if (nums[i] == numToRemove && nums[j] == numToRemove) {
            j--
        } else if (nums[i] == numToRemove && nums[j] != numToRemove) {
            val temp = nums[j]
            nums[j] = nums[i]
            nums[i] = temp
        } else {
            i++
        }
    }
    println(i)
    println(nums.joinToString())
}