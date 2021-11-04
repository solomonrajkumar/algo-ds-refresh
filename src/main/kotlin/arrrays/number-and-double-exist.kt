package arrrays

fun main() {
//    val arr = arrayOf(-2,0,10,-19,4,6,-8)
//    val arr = arrayOf(0,0)
//    val arr = arrayOf(-20,8,-6,-14,0,-19,14,4)
    val arr = arrayOf(-2,0,10,-19,4,6,-8)
    val map = mutableMapOf<Int, Int>()
    for (i in arr.indices) {
        map[i] = arr[i]
    }
    var valueFound = false
    for (i in arr.indices) {
        if (arr[i] == 0 && map.filterValues { it == 0 }.size > 1) {
            valueFound = true
            break
        } else if (map.containsValue(arr[i] * 2) && arr[i] != 0 ) {
            valueFound = true
            break
        }
    }
    if (valueFound) {
        println("true")
    } else {
        println("false")
    }
}