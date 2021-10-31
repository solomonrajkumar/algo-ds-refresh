package arrrays

fun main() {
    val nums = arrayOf(12,345,2,6,7896)
    var count = 0
    for (num in nums) {
        if (getDigits(num) % 2 == 0) {
            count++
        }
    }
    println(count)
}

fun getDigits(num: Int): Int {
    var temp = num
    var digitCount = 0
    while(temp > 0) {
        digitCount++
        temp /= 10
    }
    return digitCount
}