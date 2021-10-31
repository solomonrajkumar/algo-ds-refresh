package arrrays

fun main() {
    val nums = arrayOf(1,0,1,1,0,1)
    var maxConsecutiveOnes = 0
    var currentConsecutiveOnes = 0
    for (num in nums) {
        if (num == 1) {
            currentConsecutiveOnes++;
        } else {
            maxConsecutiveOnes = maxOf(currentConsecutiveOnes, maxConsecutiveOnes)
            currentConsecutiveOnes = 0
        }
    }
    println(maxOf(currentConsecutiveOnes, maxConsecutiveOnes))
}