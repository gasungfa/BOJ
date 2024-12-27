package challenging

//시간 초과 코드

//import java.io.BufferedReader
//import java.io.InputStreamReader
//
//data class Node(val data:Int, var left: Node? = null, var right: Node? = null)
//
//class Tree{
//    private var root:Node? = null
//    private var totalCounter = 0
//
//    fun insert(value: Int):Int{
//        var counter = 0
//        if(root == null){
//            root = Node(value, null,null)
//        }
//        else {
//            counter = insertNode(value, root!!)
//        }
//        totalCounter += counter
//        return totalCounter
//    }
//    private fun insertNode(value:Int, node:Node):Int{
//        var counter = 1
//        if(value < node.data){
//            if(node.left == null){
//                node.left = Node(value)
//            }
//            else counter += insertNode(value, node.left!!)
//        }
//        else if(value > node.data){
//            if(node.right == null){
//                node.right = Node(value)
//            }
//            else counter += insertNode(value,node.right!!)
//        }
//        return counter
//    }
//}
//
//fun main(){
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val inputs = generateSequence { br.readLine()?.toIntOrNull() }.toList()
//    val tree = Tree()
//    val sb = StringBuilder()
//    inputs.drop(1).forEach { sb.appendLine(tree.insert(it)) }
//    println(sb)
//}

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.TreeSet

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val N = br.readLine().toInt()
    val depth = IntArray(N + 2)
    var count: Long = 0

    val treeSet = TreeSet<Int>()
    treeSet.add(0)
    treeSet.add(N + 1)

    depth[0] = -1
    depth[N + 1] = -1

    repeat(N) {
        val num = br.readLine().toInt()

        val left = treeSet.lower(num)
        val right = treeSet.higher(num)

        depth[num] = maxOf(depth[left], depth[right]) + 1

        treeSet.add(num)

        count += depth[num]
        sb.append(count).append("\n")
    }
    println(sb)
}
