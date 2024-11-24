package challenging

import java.util.*

fun main(){
    val stack = Stack<Int>()
    val n = readln().toInt()
    var result = StringBuilder()
    for(i in 0 until n){
        var tmp = readln()
        if(tmp[0] == '1'){
            val integer = tmp.split(" ")[1].toInt()
            stack.push(integer);
        }
        else if(tmp.toInt() == 2){
            if(stack.size == 0){
                result.appendLine(-1)
            }
            else{
                result.appendLine(stack.peek().toInt())
                stack.pop()
            }
        }
        else if(tmp.toInt() == 3){
            result.appendLine(stack.size)
        }
        else if(tmp.toInt() == 4){
            if(stack.empty()){
                result.appendLine(1)
            }
            else{
                result.appendLine(0)
            }
        }
        else if(tmp.toInt() == 5){
            if(stack.size == 0){
                result.appendLine(-1)
            }
            else{
                result.appendLine(stack.peek())
            }
        }
    }
    println(result.toString())
}