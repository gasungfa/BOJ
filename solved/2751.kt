package solved

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    var result = StringBuilder()

    val n = br.readLine().toInt()
    val list = ArrayList<Int>(n)
    repeat(n){
        list.add(Integer.parseInt(br.readLine()))
    }
    br.close()

    list.sort()

    result.append(list.joinToString("\n"))
    bw.write(result.toString())
    bw.close()
}