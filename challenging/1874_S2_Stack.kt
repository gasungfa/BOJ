package challenging

import java.util.*

fun main(){
    val ans = StringBuilder()
    val n = readln().toInt()
    val stack = Stack<Int>()
    var now = 1
    var find = true
    repeat(n){
        val num = readln().toInt()
        while(now <= num){
            stack.push(now)
            ans.appendLine('+')
            now++
        }
        if(stack.peek() == num){
            stack.pop()
            ans.appendLine('-')
        }
        else{
            print("NO")
            find = false
            return
        }
    }
    if(find){
        print(ans)
    }
}
