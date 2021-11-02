fun main() {
    val arr = arrayOf(8,4,5,0,0,0,0,7)
//      val arr = arrayOf(1,5,2,0,6,8,0,6,0)
//      var arr = arrayOf(9,9,9,4,8,0,0,3,7,2,0,0,0,0,9,1,0,0,1,1,0,5,6,3,1,6,0,0,2,3,4,7,0,3,9,3,6,5,8,9,1,1,3,2,0,0,7,3,3,0,5,7,0,8,1,9,6,3,0,8,8,8,8,0,0,5,0,0,0,3,7,7,7,7,5,1,0,0,8,0,0)
//    val arr = arrayOf(1,0,2,3,0,4,5,0)
//    val arr = arrayOf(1,5,2,0,6,8,0,6,0)
//    val arr = arrayOf(1,0,2,3,0,0,0,0)
    var possibleDuplicates = 0
    var last = arr.size - 1
    for (i in arr.indices) {
        // EDGE CASE where standalone 0 comes at last
        if (i == last && arr[i] == 0) {
            arr[arr.size - 1] = 0
            last--
        }
        if (i>= last) break
        if (arr[i] == 0) {
            possibleDuplicates++
            last--
        }
    }
    for (i in last downTo 0) {
        if (arr[i] == 0) {
            arr[i + possibleDuplicates]  = 0
            possibleDuplicates--
        }
        arr[i + possibleDuplicates]  = arr[i]
    }
    println(arr.joinToString())
}