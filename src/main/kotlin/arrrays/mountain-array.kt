package arrrays

fun main() {
//    var arr = arrayOf(2,1)
//    var arr = arrayOf(3,5,5)
    var arr = arrayOf(0,3,2,1)
//    var arr = arrayOf(1,2,3,4,5)
//    var arr = arrayOf(6,5,4,3,2,1)
    var isIncreasing = true
    var isDecreasing = false
    var isValid = true
    if (arr.size < 3) {
        println("false")
    } else {
        if (arr[0] >= arr[1]) {
            isValid = false
        }  else{
            for (i in 0 until arr.size - 1) {
                if (arr[i] == arr[i+1]) {
                    isValid = false
                    break
                } else if (arr[i] > arr[i+1]) {
                    isDecreasing = true
                    isIncreasing = false
                } else if (arr[i] <= arr[i+1] && isDecreasing) {
                    isValid = false
                    break
                }
            }
        }
        println(isValid && !isIncreasing && isDecreasing)
    }
}