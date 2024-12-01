package solved

import java.util.LinkedList

fun main(){
    val n = readln().toInt()
    val arr = Array(n+1){ArrayList<Int>()}
    for(i in 0 until n-1){
        var temp = readln().split(" ")
        arr[temp[0].toInt()].add(temp[1].toInt())
        arr[temp[1].toInt()].add(temp[0].toInt())
    }
    bfs(n,arr)
}

fun bfs(n:Int,arr:Array<ArrayList<Int>>){
    val start = 1
    val visited = BooleanArray(n+1){false}
    val queue = LinkedList<Int>()
    var result = Array<Int>(n+1){0}

    queue.add(start)
    visited[start] = true
    while(queue.isNotEmpty()){
        val current = queue.poll()
        for(next in arr[current]){
            if(!visited[next]){
                visited[next] = true
                queue.add(next)
                result[next] = current
            }
        }
    }
    for(i in 2..n){
        println(result[i])
    }
}
