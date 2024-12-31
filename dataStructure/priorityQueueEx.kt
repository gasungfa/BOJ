package dataStructure

enum class HeapType{
    MIN,
    MAX
}

class Heap(private val type: HeapType = HeapType.MIN){
    private val list = mutableListOf<Int>()

    fun insert(value: Int){
        list.add(value)
        heapifyUp(list.lastIndex)
    }

    fun delete():Int?{
        if(list.isEmpty()) return null

        val root = list[0]
        val last = list.last()
        list[0] = last
        list.removeAt(list.lastIndex)
        heapifyDown(0)

        return root
    }

    //특정 노드의 부모 노드와 값을 비교하여, heap의 성질을 유지하는 메서드
    private fun heapifyUp(index:Int){
        if(index <= 0) return

        val parentIndex = (index - 1)/2
        if(compare(index,parentIndex)){
            swap(index,parentIndex)
            heapifyUp(parentIndex)
        }
    }
    //특정 노드의 자식 노드와 값을 비교하여, heap의 성질을 유지하는 메서드
    private fun heapifyDown(index: Int){
        val leftChildIndex = index *2 +1
        val rightChildIndex = index*2 +2
        var targetIndex = index

        if(leftChildIndex < list.size && compare(leftChildIndex,targetIndex)){
            targetIndex = leftChildIndex
        }

        if(rightChildIndex < list.size && compare(rightChildIndex, targetIndex)){
            targetIndex = rightChildIndex
        }
        if(targetIndex != index){
            swap(index,targetIndex)
            heapifyDown(targetIndex)
        }
    }

    private fun compare(index1: Int, index2: Int):Boolean{
        val value1 = list[index1]
        val value2 = list[index2]

        return if(type == HeapType.MIN){
            value1 < value2
        }else{
            value1>value2
        }
    }

    private fun swap(index1:Int, index2: Int){
        val temp = list[index1]
        list[index1]=list[index2]
        list[index2] = temp
    }
}

fun main(){
    val heap = Heap()
    heap.insert(10)
    heap.insert(50)
    heap.insert(30)
    heap.insert(20)
    heap.insert(40)

    println(heap.delete())
    println(heap.delete())
    println(heap.delete())
    println(heap.delete())
    println(heap.delete())
}