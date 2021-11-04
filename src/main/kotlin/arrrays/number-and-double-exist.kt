package arrrays

fun main() {
//    val arr = arrayOf(-2,0,10,-19,4,6,-8)
//    val arr = arrayOf(0,0)
    val arr = arrayOf(-20,8,-6,-14,0,-19,14,4,-6)
//    val arr = arrayOf(-2,0,10,-19,4,6,-8)
    val set = mutableSetOf<Int>()
    var countOfZeroes = 0
    for (i in arr.indices) {
        if (arr[i] == 0) {
            countOfZeroes++
        } else if (arr[i] % 2 == 0) {
            set.add(arr[i])
        }
    }
    var valueFound = false
    for (i in arr.indices) {
        if(set.contains(arr[i] * 2)) {
            valueFound = true
            break
        }

    }
    if (valueFound || countOfZeroes > 1) {
        println("true")
    } else {
        println("false")
    }
}