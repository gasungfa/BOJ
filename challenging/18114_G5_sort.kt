package challenging

fun main(){
    val input = readln().split(" ")
    val list = readln().split(" ").map { it.toInt() }.toIntArray()

    if(list.contains(input[1].toInt())){
        println(1)
        return
    }

    list.sort()
    var i = 0
    var j = list.size -1
    var weight = 0

    while(i<j){
        weight = list[i] + list[j]
        if(weight > input[1].toInt()){
            j--;
        }else if(weight == input[1].toInt()){
            println(1)
            return
        }else{
            if(list.indexOf(input[1].toInt()-weight) in (i + 1)..<j){
                println(1)
                return
            }
            i++
        }
    }

    println(0)


}