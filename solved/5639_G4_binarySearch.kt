package solved

import java.io.BufferedReader
import java.io.InputStreamReader


data class Node(val value:Int, var left: Node?, var right: Node?){
    fun addPreOrder(n:Int){
        if(n> value){
            if(right == null) right = Node(n,null,null)
            else{
                right!!.addPreOrder(n)
            }
        }
        else{
            if(left==null) left= Node(n,null,null)
            else{
                left!!.addPreOrder(n)
            }
        }
    }
}

fun postOrder(node: Node?){
    if(node != null){
        postOrder(node.left)
        postOrder(node.right)
        println(node.value)
    }
}


fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val inputs = generateSequence { br.readLine()?.toIntOrNull() }.toList()
    val root = Node(inputs.first(),null,null)
    inputs.drop(1).forEach { root.addPreOrder(it) }

    postOrder(root)
}