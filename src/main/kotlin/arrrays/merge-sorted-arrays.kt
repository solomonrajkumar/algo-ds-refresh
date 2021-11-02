fun main() {
    val nums1 = arrayOf(1,2,3,0,0,0)
    val nums2 = arrayOf(2,5,6)
    var num1Size = 3
    var num2Size = 3
//    val nums1 = arrayOf(0)
//    val nums2 = arrayOf(1)
//    var m = 0
//    var n = 1
    var lastIndex = nums1.size - 1
    while(lastIndex >= 0 && num1Size >= 0 && num2Size > 0) {
        if (num1Size == 0 && num2Size == 1) {
          nums1[0] = nums2[0]
        } else if( num1Size==0 ) {
            nums1[lastIndex] = nums2[num2Size - 1]
            num2Size--
        } else if (nums1[num1Size - 1] <= nums2[num2Size - 1]) {
            nums1[lastIndex] = nums2[num2Size - 1]
            num2Size--
        } else {
            nums1[lastIndex] = nums1[num1Size - 1]
            num1Size--
        }
        lastIndex--
    }
    
    println(nums1.joinToString())
}