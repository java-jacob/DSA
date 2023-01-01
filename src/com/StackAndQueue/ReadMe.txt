Efficiency Of Stacks
------------------
Elements inserted into Stack and removed with O(1)
No comparison or moves are done

Stack is a LIFO data structure.

Efficiency of Queues
--------------------
Insert/Remove with O(1)

Circular Queue/Ring Buffer
-------------------------
Normal queue after some items are removed also , queue can be full as rear point reached max size.
To avoid this problem, Front and rear wraps around to the front of the array, such queue is called
Circular Queue/Ring Buffer.


Deque.
-------
Double Ended queue, you can insert and delete at both ends.
insertLeft(), insertRight()
deleteLeft(), deleteRight()

insertLeft() & deleteLeft() - > Dequeue is a STACK.
insertLeft() & deleteRight() -> Dequeue is a QUEUE.

Priority Queue
--------------
Elements are ordered inside a queue based on a key value or priority.
Eg. Thread scheduling.
Letter stacking - current bill stacked on top.

Efficiency of Priority Queue:
Insertion - O(N)
Deletion - O(N)


Stack:

A <- top
B
C
D



Queue:

0 A <- Front
1 B
2 C
3 D <- Rear