package solved

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    var n = br.readLine().toInt()
    var arr = IntArray(n)
    for(i in 0 until n){
        arr[i] = br.readLine().toInt()
    }
    br.close()
    arr.sort()
    arr.forEach {
        bw.write("$it\n")
    }
    bw.close()
//    val measuredTime = measureNanoTime {
//        val br = System.`in`.bufferedReader()
//        val bw = System.`out`.bufferedWriter()
//        var n = br.readLine().toInt()
//        var arr = IntArray(n)
//        for(i in 0 until n){
//            arr[i] = br.readLine().toInt()
//        }
//        br.close()
//        arr.forEach {
//            bw.write("$it\n")
//        }
//        bw.close()
//    }
//    print(measuredTime)
}