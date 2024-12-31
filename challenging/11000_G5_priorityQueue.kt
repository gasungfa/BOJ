package challenging

import java.util.PriorityQueue

fun main(){
    var result = 0
    val n = readln().toInt()
    val list = mutableListOf<Pair<Int,Int>>()
    repeat(n){
        val temp = readln().split(" ")
        list.add(Pair(temp[0].toInt(),temp[1].toInt()))
    }
    val sortedList = list.sortedWith(compareBy<Pair<Int,Int>>{it.first}.thenBy { it.second })
    val queue = PriorityQueue<Int>()

    //queue.peek = queue 첫값 확인
    //queue.poll = queue 첫값 확인 및 삭제
    //우선 순위 큐이므로 젤 작은 값 출력
    sortedList.forEach {
        queue.add(it.second)
        while(queue.isNotEmpty() && queue.peek() <= it.first){
            queue.poll()
        }
        result = maxOf(result,queue.size)
    }
    println(result)
}
