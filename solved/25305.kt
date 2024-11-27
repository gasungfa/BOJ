package solved

fun main(){
    var (n,k) = readln().split(" ").map { it.toInt() }
    var arr = readln().split(" ").map { it.toInt() }.toIntArray().sortedDescending()
    println(arr[k-1])
}