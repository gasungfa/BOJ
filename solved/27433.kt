package solved

fun main(){
    val n = readln().toLong()
    val result:Long = if(n>1){
        rec(n)
    } else 1
    print(result)
}
fun rec(n:Long):Long{
    var result:Long = n
    if(n>1) result *= rec(n-1)
    return result
}