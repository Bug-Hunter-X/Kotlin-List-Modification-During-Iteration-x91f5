fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    for (i in list.size - 1 downTo 0) {
        if (list[i] % 2 == 0) {
            list.removeAt(i)
        }
    }
    println(list) // Output: [1, 3, 5]

    //Alternative solution using filter
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    list2.retainAll { it % 2 != 0 }
    println(list2) // Output: [1, 3, 5]
} 