package arrrays

fun main() {
    replaceElements()
}

fun replaceElements() {
//    val arr = arrayOf(17,18,5,4,6,1)
    val arr = arrayOf(400)
    var arrLength = arr.size
    var i = arrLength - 2
    var biggestNumber = arr[arrLength - 1]
    arr[arrLength - 1] = -1
    while(i >= 0) {
        val temp = arr[i]
        arr[i] = biggestNumber
        biggestNumber = if (biggestNumber > temp) biggestNumber else temp
        i--
    }
    println(arr.joinToString())
}