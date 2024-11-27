package solved

//1번째 방법(class 생성후 데이터 정렬)

//data class Node(val x:Int, val y:Int)
//
//fun main(){
//    val n = readln().toInt()
//    val arr = Array<Node?>(n){null}
//    for(i in 0 until n){
//        val temp = readln().split(" ")
//        arr[i] = Node(x= temp[0].toInt(), y = temp[1].toInt())
//    }
//    arr.sortWith(compareBy<Node?>{it!!.x}.thenBy { it!!.y })
//    arr.forEach { println("${it!!.x} ${it!!.y}") }
//}

//2번째 방법(pair사용)
fun main(){
    var n = readln().toInt()
    val arr = ArrayList<Pair<Int,Int>>()
    for(i in 0 until n){
        val temp = readln().split(" ")
        arr.add(Pair(temp[0].toInt(),temp[1].toInt()))
    }
    arr.sortWith(compareBy({it.first},{it.second}))
    repeat(n){
        println("${arr[it].first} ${arr[it].second}")
    }

}