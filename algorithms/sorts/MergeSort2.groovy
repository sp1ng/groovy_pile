/**
 * This is taken from RossetaCode website: https://rosettacode.org/wiki/Sorting_algorithms/Merge_sort.
 */
def merge = { List left, List right ->
    List mergeList = []
    while (left && right) {
        print "."
        mergeList << ((left[-1] > right[-1]) ? left.pop() : right.pop())
    }
    mergeList = mergeList.reverse()
    mergeList = left + right + mergeList
}

def mergeSort;
mergeSort = { List list ->

    def n = list.size()
    if (n < 2) return list

    def middle = n.intdiv(2)
    def left = [] + list[0..<middle]
    def right = [] + list[middle..<n]
    left = mergeSort(left)
    right = mergeSort(right)

    if (left[-1] <= right[0]) return left + right

    merge(left, right)
}


println (mergeSort([23,76,99,58,97,57,35,89,51,38,95,92,24,46,31,24,14,12,57,78,4]))
println (mergeSort([88,18,31,44,4,0,8,81,14,78,20,76,84,33,73,75,82,5,62,70,12,7,1]))
println ()
println (mergeSort([10, 10.0, 10.00, 1]))
println (mergeSort([10, 10.00, 10.0, 1]))
println (mergeSort([10.0, 10, 10.00, 1]))
println (mergeSort([10.0, 10.00, 10, 1]))
println (mergeSort([10.00, 10, 10.0, 1]))
println (mergeSort([10.00, 10.0, 10, 1]))