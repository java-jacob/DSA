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
For almost sorted data we get O(N)
Otherwise N*(N-1)/4
Copy is less costly than a swap.




10000 random integers - sort timings  - 28,14,4 ms resp
BubbleSortTime:      28056300
SelectionSortTime:   14745400
InsertionSortTime:    4359400
BubbleSortTime:      27819600
SelectionSortTime:   14723100
InsertionSortTime:    4350000
BubbleSortTime:      29815700
SelectionSortTime:   19464600
InsertionSortTime:    9175100
BubbleSortTime:      30897500
SelectionSortTime:   14757700
InsertionSortTime:    4230400
