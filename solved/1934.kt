package solved

fun main(){
    val n = readln().toInt()
    var str = StringBuilder()
    for(i in 0 until n){
        var temp = readln().split(" ")
        str.appendLine(temp[0].toInt()*temp[1].toInt()/(find(temp[0].toInt(),temp[1].toInt())))
    }
    println(str)
}

fun find(a:Int, b:Int):Int{
    return if(b!=0) find(b,a%b) else a
}
