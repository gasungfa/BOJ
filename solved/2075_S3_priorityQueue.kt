package solved

class Heap{
    private val list = mutableListOf<Int>()

    fun insert(n: Int){
        list.add(n)
        heapifyUp(list.lastIndex)
    }

    private fun heapifyUp(index:Int){
        if(index <= 0) return

        val parentIndex = (index - 1)/2

        if(list[index] > list[parentIndex]){
            val temp = list[index]
            list[index] = list[parentIndex]
            list[parentIndex] = temp
            heapifyUp(parentIndex)
        }
    }
    private fun heapifyDown(index: Int){
        val leftChildIndex = index *2 +1
        val rightChildIndex = index*2 +2
        var targetIndex = index

        if(leftChildIndex < list.size && list[leftChildIndex] > list[targetIndex]){
            targetIndex = leftChildIndex
        }

        if(rightChildIndex < list.size && list[rightChildIndex] > list[targetIndex]){
            targetIndex = rightChildIndex
        }
        if(targetIndex != index){
            val temp= list[index]
            list[index] = list[targetIndex]
            list[targetIndex] = temp
            heapifyDown(targetIndex)
        }
    }


    fun findResult(n:Int):Int?{
        var result = 0
        repeat(n){
            val root = list[0]
            val last = list.last()
            list[0] = last
            list.removeAt(list.lastIndex)
            heapifyDown(0)
            result = root
        }
        return result
    }


}

fun main(){
    val heap = Heap()
    val n = readln().toInt()
    repeat(n){
        val row = readln().split(" ")
        for(i in 0 until n){
            heap.insert(row[i].toInt())
        }
    }
    println(heap.findResult(n))
}