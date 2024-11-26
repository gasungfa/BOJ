package solved

fun main(){
    val arr = IntArray(5)
    val result = StringBuilder()
    for(i in 0 until 5){
        arr[i] = readln().toInt()
    }
    arr.sort()
    result.appendLine(arr.average().toInt())
    result.appendLine(arr[2])
    println(result)
}