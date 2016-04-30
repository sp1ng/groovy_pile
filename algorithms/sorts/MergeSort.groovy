/*
Shortest still reasonable implementation of merge sort algorithm.

SPLIT+MERGE
def merge_sort(inlist) {
	1. if inlist is one element or less return - no need to sort
	2. split the list (at least 2 elements) - 2 halves (it does not matter how) llist, rlist
	3. llist = merge_sort(llist)
	   rlist = merge_sort(rlist)
	4. return merged both lists (llist + rlist)
just simply merge two sequencing
def mergeThem(left, right)
	1. mresult = [] (empty list)
	2. while left and right list are not empty
	3. if any of them have elements left
	return the sorted result


 */

def mergesort(list) {
    if (list.size() < 2) return list

    def middle = list.size().intdiv(2)
    def left = mergesort(list[0..<middle])
    def right = mergesort(list[middle..<list.size()])

    if (left[-1] <= right[0]) return left + right

    merge(left, right)
}

def merge(left, right) {
    def result = []
    while (left.size() > 0 && right.size() > 0) {
        result << ((left[-1] > right[-1]) ? left.pop() : right.pop())
    }

    left + right + result.reverse();
}

println(mergesort([5, 1, 2, 12, 543, 8, 3, 6]))

