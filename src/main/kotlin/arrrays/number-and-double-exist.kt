package arrrays

fun main() {
//    val arr = arrayOf(-2,0,10,-19,4,6,-8)
//    val arr = arrayOf(0,0)
//    val arr = arrayOf(-20,8,-6,-14,0,-19,14,4,-6)
//    val arr = arrayOf(-2,0,10,-19,4,6,-8)
//    val arr = arrayOf(10,2,5,3)
//    val arr = arrayOf(7,1,14,11)
    val arr = arrayOf(3,1,7,11)
    val set = mutableSetOf<Int>()
    var valueFound = false
    for (i in arr.indices) {
        if (set.contains(arr[i] * 2) || ( arr[i] % 2 == 0 && set.contains(arr[i] / 2))) {
            valueFound = true
            break
        }
        set.add(arr[i])
    }
    if (valueFound) {
        println("true")
    } else {
        println("false")
    }
}