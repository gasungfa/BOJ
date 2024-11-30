package solved

fun main(){
    val n = readln().toInt()
    var arr = Array(n){ readln() }.distinct().sorted().sortedWith(compareBy{it.length})

    arr.forEach { println(it) }
}