/**
 * Insertion Sort
 */


def insertionSort(list) {
    for (i in 0..list.size()-1) {
        def x = list[i]
        def j = i
        while (j > 0 && list[j-1] > x) {
            list[j] = list[j-1]
            j = j - 1
        }
        list[j] = x
    }
    return list
}

println (insertionSort([-1,4,1,5,7,5,10]))