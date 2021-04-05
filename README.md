# Java Implementations
## Stack
LIFO Data Structure. In this repository is presented a Java API for stack implemented using linked-lists and a Java API for stack implemented with fixed capacity array in Stacks directory.
## Queue
FIFO Data Structure. In this repository is presented a Java API for queue implemented using linked-lists in Queues directory.

## Sort Algorithms
### Selection Sort
The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. In this repository is presented a Java API for selection sort in SortAlgorithms directory.

### Insertion sort  
Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part. In this repository is presented a Java API for insertion sort in SortAlgorithms directory.

### Shell sort
 In shellSort, we make the array h-sorted for a large value of h. We keep reducing the value of h until it becomes 1. An array is said to be h-sorted if all sublists of every h’th element is sorted. In this repository is presented a Java API for shell sort in SortAlgorithms directory.

### MergeSort
MergeSort divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves. The merge() function is used for merging two halves. The merge(arr, l, m, r) is a key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one. In this repository is presented a Java API for mergesort and a Java API for bottom-up mergesort in MergeSort directory.

### QuickSort
QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways. 

1. Always pick first element as pivot.
2. Always pick last element as pivot (implemented below)
3. Pick a random element as pivot.
4. Pick median as pivot.

The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array as pivot, put x at its correct position in sorted array and put all smaller elements (smaller than x) before x, and put all greater elements (greater than x) after x. All this should be done in linear time. In this repository is presented a Java API for quicksort and a Java API for 3-way quicksort in QuickSort fdirectory.

### HeapSort

HeapSort is a comparison based sorting technique based on Binary Heap data structure. It is similar to selection sort where we first find the minimum element and place the minimum element at the beginning. We repeat the same process for the remaining elements. In this repository is presented a Java API for shell sort in SortAlgorithms directory.

## Priority Queue
Priority Queue is an extension of queue with following properties.

1. Every item has a priority associated with it.
2. An element with high priority is dequeued before an element with low priority.
3. If two elements have the same priority, they are served according to their order in the queue.

In this repository is presented a Java API for priority queue implemented using array and a Java API for priority queue implemented using binary heap in PriorityQueues directory.

## Binary Search Tree

Binary Search Tree is a node-based binary tree data structure which has the following properties:

1. The left subtree of a node contains only nodes with keys lesser than the node’s key.
2. The right subtree of a node contains only nodes with keys greater than the node’s key.
3. The left and right subtree each must also be a binary search tree.

In this repository is presented a Java API for binary search and a Java API for binary search tree in BinarySearchTrees directory.

## Graph

A Graph is a non-linear data structure consisting of nodes and edges. The nodes are sometimes also referred to as vertices and the edges are lines or arcs that connect any two nodes in the graph. In this repository is presented a Java API for graph in Graphs directory.

### BFS

Breadth First Traversal (or Search) for a graph is similar to Breadth First Traversal of a tree (See method 2 of this post). The only catch here is, unlike trees, graphs may contain cycles, so we may come to the same node again. To avoid processing a node more than once, we use a boolean visited array. For simplicity, it is assumed that all vertices are reachable from the starting vertex. In this repository is presented a Java API for BFS on a graph in Graphs directory.

### DFS

Depth First Traversal (or Search) for a graph is similar to Depth First Traversal of a tree. The only catch here is, unlike trees, graphs may contain cycles, a node may be visited twice. To avoid processing a node more than once, use a boolean visited array. In this repository is presented a Java API for DFS on a graph in Graphs directory.

### Connected Componets

Finding connected components for an undirected graph is an easier task. We simple need to do either BFS or DFS starting from every unvisited vertex, and we get all strongly connected components. In this repository is presented a Java API for CC on a graph in Graphs directory.

## Directed Graphs

In this repository is presented a Java API for directed graph, DFS on directed graph, BFS on directed graph and Kosaraju Algorithm for strongly connected components in DirectedGraphs directory.

