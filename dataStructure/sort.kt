package dataStructure

fun main(){

}

fun bubbleSort(arr:IntArray):IntArray{
    var temp= 0
    for(i in arr){
        for(j in 1 until arr.size-i){
            if(arr[j-1] > arr[j]){
                temp = arr[j-1]
                arr[j-1] = arr[j]
                arr[j] = temp
            }
        }
    }
    return arr
}

fun selectionSort(arr:IntArray){
    var indexMin = 0
    var temp = 0

    for(i in arr){
        indexMin = i
        for(j in i+1 until arr.size-1){
            if(arr[j] < indexMin){
                indexMin = arr[j]
            }
        }
        temp = arr[i]
        arr[i] = indexMin
        arr[indexMin] = temp
    }
}

fun insertionSort(arr:IntArray){
    for(index in arr){
        val temp = arr[index]
        var prev = index -1
        while((prev >= 0) && (arr[prev] > temp)){
            arr[prev+1] = arr[prev]
            prev--
        }
        arr[prev+1] = temp
    }
}
