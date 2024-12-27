package solved

fun main(){
    var n = readln().toInt()
    var arr = readln().split(" ").map{it.toInt()}
    var sortedArr = arr.distinct().sorted()

    val indexMap = sortedArr.withIndex().associate { it.value to it.index }
    //withIndex = value와 index를 모두 받는 kotlin collection
    //associate = List를 Map으로 변환

    val result = arr.map{indexMap[it]}
    //val result = arr.map{indexMap[it]}
    println(result.joinToString(" "))

}