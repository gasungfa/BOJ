package challenging

fun main(){
    val (h,w) = readln().split(" ")
    val n = readln().toInt()
    val stickers = Array(n){IntArray(3)}
    repeat(n){
        val (r,c) = readln().split(" ")
        stickers[it][0] = r.toInt()
        stickers[it][1] = c.toInt()
        stickers[it][2] = r.toInt() * c.toInt();
    }
    var maxArea = 0


    fun isCanStick(a:IntArray, b:IntArray):Boolean{
        for(i in 0 until 2){
            for(j in 0 until 2){
                if((a[i] + b[j]) <= h.toInt() && a[(i + 1) % 2].coerceAtLeast(b[(j + 1) % 2]) <= w.toInt())return true
                if((a[i] + b[j]) <= w.toInt() && a[(i + 1) % 2].coerceAtLeast(b[(j + 1) % 2]) <= h.toInt())return true
            }
        }
        return false
    }

    fun calcMaxArea(){
        for(i in stickers.indices){
            for(j in i+1 until stickers.size){
                if(i == j)continue
                if(isCanStick(stickers[i],stickers[j])){
                    maxArea = maxArea.coerceAtLeast(stickers[i][2] + stickers[j][2])
                }
            }
        }
    }

    calcMaxArea()
    println(maxArea)

}