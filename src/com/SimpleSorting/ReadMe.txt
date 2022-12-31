BubbleSort - O(N*N)
--------------------
Comparisons in each Pass = N-1
N-1 + N-2 + N-3 ... +1 = N*(N-1)/2 appox to N*N/2

Half the time swapped:
N*N/4
So Comparisons and Swaps are proportional to N*N


SelectionSort
---------------
Comparisons same - N*(N-1)/2
There is not a swap always - Swap done only < N times max instead of N*N/4 in BubbleSort
For eg. 100 items - 4950 comparisons and < 100 comparisons. earlier it should be 2500 comparisons N*N/4
Because of lesser swaps SelectionSort faster than bubble sort.
For smaller values of N, selection sort is faster if swap times are greater than comparison times.

Insertion Sort
---------------


