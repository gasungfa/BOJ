package solved

import java.util.Stack

fun main(){
    val n = readln().toInt()
    val stack = Stack<Int>()
    repeat(n){
        val input = readln().split(" ")
        if(input[0] == "push"){
            stack.push(input[1].toInt())
        }
        if(input[0] == "pop"){
            if(stack.isEmpty()){
                println(-1)
            }
            else{
                println(stack.pop())
            }
        }
        if(input[0] == "top"){
            if(stack.isEmpty()){
                println(-1)
            }
            else{
                println(stack.peek())
            }
        }
        if(input[0] == "size"){
            println(stack.size)
        }
        if(input[0] == "empty"){
            if(stack.isEmpty())println(1) else println(0)
        }

    }
}