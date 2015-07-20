/**
 * A version of BubbleSort. It is not the classical version.
 */

def bubbleSort(list) {
    for (i in 0..list.size()-2) {
        def swapped = false
        for (k in i+1..list.size()-1) {
            if (list[i] > list[k]) {
                Collections.swap(list, i, k)
                swapped = true
            }
        }
        if (!swapped) {
            break
        }
    }
    return list
}

println(bubbleSort([5,1,0,1,2,3]))