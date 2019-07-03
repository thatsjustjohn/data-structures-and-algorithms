# Sorting Algorithms

This is an implementation of a sorting algorithms.  Below are a list of the methods

## Challenge

Implement sorting algorithms

## Approach & Efficiency

Approach

Implementation of basic sorting algorithms

Efficiency  

Insertion Sort: T:O(n^2) S:O(1)\
Merge Sort: T:O(n log n) S:O(n)\
QuickSort: T:O(n log n) S:O(log n)

## API

```public static int[] insertionSort(int[] arr)``` Takes in an array of ints and returns a sorted array of ints\
``` public static int[] mergeSort(int[] arr)``` Takes in an array of ints and returns a sorted Array of ints.\
``` private static int[] merge(int[] leftArr , int[] rightArr, int[] arr)``` Takes in 3 arrays and merges the 2 into one in order.\
```public static int[] quickSort(int[] arr)``` Takes in an array of ints and returns a sorted array of ints.\
```public static int[] quickSort(int[] arr, int left, int right)``` Takes in an array of ints and a left and right positions and returns a sorted array between those positions.\
```private static int partition(int[] arr, int left, int right)``` Takes in an array of ints and a left and right point, partions moving everything to less to the left and everything greater to the right.\
```private static void swap(int[] arr, int i, int low)``` Takes in an array of ints and swaps the 2 positions.