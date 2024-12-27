package solved

fun main(){
    var n = readln()!!.toInt()
    var list = arrayListOf<Pair<Int,String>>()
    for(i in 0 until n){
        var tmp = readln().split(" ")
        list.add(Pair(tmp[0].toInt(),tmp[1]))

    }
    var sortedList = list.sortedWith(compareBy { it.first })
    for(i in sortedList){
        println("${i.first} ${i.second}")
    }
}