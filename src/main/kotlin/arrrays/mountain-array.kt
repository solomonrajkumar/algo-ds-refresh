package arrrays

fun main() {
    println(validateMountainArray())
}

fun validateMountainArray(): Boolean {
        var arr = arrayOf(2,1)
//    var arr = arrayOf(3,5,5)
//    var arr = arrayOf(0,3,2,1)
//    var arr = arrayOf(1,2,3,4,5)
//    var arr = arrayOf(6,5,4,3,2,1)

    if (arr.size < 3) {
        return false
    }

    var i = 0
    var lastIndex = arr.size - 1
    while (i < lastIndex && arr[i] < arr[i+1]) {
        i++
    }
    if (i == 0 || i == lastIndex) {
        return false
    }
    while (i < lastIndex && arr[i] > arr[i+1]) {
        i++
    }
    return (i == lastIndex)
}