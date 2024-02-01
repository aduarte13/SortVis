class Sort {


    fun bubbleSort(list: MutableList<Int>){

        for (i in 0..<list.size - 1) {
            for (j in 0..<list.size - i - 1) {
                if (list[j] > list[j + 1]) {
                    // Swap the elements
                    val temp = list[j]
                    list[j] = list[j + 1]
                    list[j + 1] = temp
                    Thread.sleep(1)
                    println("sorting...")
                    //redrawSwappingBars(j, j + 1)
                }
            }
        }

    }

    fun insertionSort(list: MutableList<Int>){
        val n = list.size
        for (i in 1 until n) {
            val key = list[i]
            var j = i - 1
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j]
                j--
            }
            list[j + 1] = key
            Thread.sleep(10)
            println("sorting...")
            //redrawSwappingBars(i, j + 1)
        }
    }
}