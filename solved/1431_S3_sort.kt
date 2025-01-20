package solved

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val list = ArrayList<String>()

    repeat(n){
        list.add(br.readLine())
    }
    br.close()
    list.sortWith(compareBy<String> {it.length}.thenBy { it.filter { char->char.isDigit() }.sumOf { sum->sum.digitToInt() } }.thenBy { it })
    list.forEach {
        bw.write("$it\n")
    }
    bw.close()
}