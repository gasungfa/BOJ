package challenging

import kotlin.system.measureNanoTime

fun main(){
    val br = System.`in`.bufferedReader()
    val (n,k) = br.readLine().split(" ").map { it.toInt() }
//    val nums = readln().split(" ").map { it.toInt() }.toIntArray().sorted()
    val nums = br.readLine().split(" ").map { it.toInt() }
    println(nums.sorted()[k-1])
}